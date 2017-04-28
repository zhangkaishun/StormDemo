package com.zks.wordcount;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.tuple.Fields;

public class WordCountTopology {

	private static final String SENTENCE_SPOUT_ID="sentence-spout";
	private static final String SPLIT_BOLT_ID="split-bolt";
	private static final String COUNT_BOLT_ID="count-bolt";
	private static final String REPORT_BOLT_ID="report-bolt";
	private static final String TOPOLOGY_NAME="word-cout-topology";
	public static void main(String[] args) throws Exception{
		SentenceSpout spout=new SentenceSpout();
		SplitSentenceBolt splitBolt=new SplitSentenceBolt();
		WordCountBolt countBolt=new WordCountBolt();
		ReportBolt reportBolt=new ReportBolt();  
		TopologyBuilder builder=new TopologyBuilder();
		builder.setSpout(SENTENCE_SPOUT_ID, spout);
		//Tuples are randomly distributed across the bolt’s tasks in a way such that each bolt 
		//is guaranteed to get an equal number of tuples.
		//														注意：此处shuffleGrouping中的参数为spout的id，代表冲spout获取数据
		builder.setBolt(SPLIT_BOLT_ID,splitBolt).shuffleGrouping(SENTENCE_SPOUT_ID);
													//相同的，发送到同一个bolt
		builder.setBolt(COUNT_BOLT_ID, countBolt).fieldsGrouping(SPLIT_BOLT_ID, new Fields("word"));
													//全部发送到一个
		builder.setBolt(REPORT_BOLT_ID,reportBolt).globalGrouping(COUNT_BOLT_ID);
		Config config=new Config();
		LocalCluster cluster=new LocalCluster();
		cluster.submitTopology(TOPOLOGY_NAME, config, builder.createTopology());
		Thread.sleep(10000);
		cluster.killTopology(TOPOLOGY_NAME);
		cluster.shutdown();
	}
	
	
}
