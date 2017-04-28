package com.zks.wordcount;

import java.util.HashMap;
import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

public class WordCountBolt extends BaseRichBolt{

	private OutputCollector collector;
	private HashMap<String,Long> counts=new HashMap<String,Long>();
	@Override
	public void execute(Tuple tuple) {
		String word=tuple.getStringByField("word");
		Long count = this.counts.get(word);
		if(count==null){
			count=0l;
		}
		count++;
		this.counts.put(word, count);
		this.collector.emit(new Values(word,count));
	}

	@Override
	public void prepare(Map arg0, TopologyContext arg1, OutputCollector arg2) {
		this.collector=arg2;
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("word","count"));
	}

}
