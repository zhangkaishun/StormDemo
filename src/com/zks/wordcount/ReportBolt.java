package com.zks.wordcount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

public class ReportBolt extends BaseRichBolt{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String,Long> counts=null;
	@Override
	public void execute(Tuple tuple) {
		String word=tuple.getStringByField("word");
		Long count=tuple.getLongByField("count");
		this.counts.put(word, count);
	}

	@Override
	public void prepare(Map arg0, TopologyContext arg1, OutputCollector arg2) {
		counts=new HashMap<String,Long>();
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		
	}
	/**
	 * storm ����ֹһ��bolt֮ǰ������ⷽ����ͨ����������ͷ�boltռ�õ���Դ����
	 * �򿪵��ļ���������ݿ�����
	 */
	@Override
	public void cleanup() {
		System.out.println("-------��ʼ���--------");
		List<String> keys=new ArrayList<String>();
		keys.addAll(counts.keySet());
		Collections.sort(keys);
		for(String key:keys){
			System.out.println("word:"+key+" :"+counts.get(key));
		}
		System.out.println("-------�������---------");
	}

}
