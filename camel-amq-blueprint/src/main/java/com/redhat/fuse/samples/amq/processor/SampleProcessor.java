package com.redhat.fuse.samples.amq.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.fuse.samples.amq.Activator;


public class SampleProcessor implements Processor {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleProcessor.class);
    
    @Override
    public void process(Exchange exchange) throws Exception {
        LOGGER.info("Processing Exchange {}", exchange.getIn().getBody());
    }

}
