package com.mczapiewski.spring.activiti;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ResumeService {
	private static final Logger LOGGER = Logger.getLogger(ResumeService.class);
	
    public void storeResume() {
        LOGGER.info("Storing resume ...");
    }
}