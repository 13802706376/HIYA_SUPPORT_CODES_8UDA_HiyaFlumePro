package com.hiya.da.flume;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * agent.sources = so1
	agent.channels = c1
	agent.sinks = s1
	
	agent.sources.so1.type = avro
	agent.sources.so1.bind = 0.0.0.0
	agent.sources.so1.port = 44444
	agent.sources.so1.channels = c1
	
	agent.channels.c1.type = memory
	agent.channels.c1.capacity = 1000
	agent.channels.c1.transactionCapacity = 100
	
	agent.sinks.s1.type = org.riderzen.flume.sink.MongoSink
	agent.sinks.s1.host = localhost
	agent.sinks.s1.port = 27017
	agent.sinks.s1.model = single
	agent.sinks.s1.db = test
	agent.sinks.s1.collection = log
	agent.sinks.s1.batch = 100
	agent.sinks.s1.channel = c1
 * @author zjq
 *
 */
public class HiyaFlumeProductor
{
	static final Log log = LogFactory.getLog(HiyaFlumeProductor.class);

	public static void main(String[] args)
	{
		log.info("{'name':'Adam', 'age':'26', 'skill':'reading'}");
		log.info("{'name':'Adam2', 'age':'24', 'skill':'reading44'}");
	}

}
