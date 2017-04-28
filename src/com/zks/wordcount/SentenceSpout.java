package com.zks.wordcount;

import java.util.Map;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

public class SentenceSpout extends BaseRichSpout{

	private SpoutOutputCollector collector;
	private String[] sentences={"my dog hs fleas",
			"i like clou beverages",
			"do not hvae a cow man",
			"i do not thin i like fleas"};
	private int index=0;
	@Override
	public void nextTuple() {
	this.collector.emit(new Values(sentences[index]));	
	index++;
	if(index>=sentences.length){
		index=0;
	}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	/**
	 * 初始化时调用此方法
	 * arg0  代表storm配置信息
	 */
	@Override
	public void open(Map arg0, TopologyContext arg1, SpoutOutputCollector arg2) {
		this.collector=arg2;
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("sentence"));
	}

	
}
