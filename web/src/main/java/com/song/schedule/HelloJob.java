package com.song.schedule;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @ description:
 * @ author: swg
 * @ created: 2018/2/6
 */
public class HelloJob implements Job, Serializable{

    private static final Logger logger = LoggerFactory.getLogger(HelloJob.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDetail jobDetail = context.getJobDetail();
        String description = jobDetail.getDescription();
        logger.warn("hello  world !! {}", description);
    }
}
