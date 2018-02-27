package com.song.schedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.Serializable;

/**
 * @ description:
 * @ author: swg
 * @ created: 2018/2/12
 */
public class SpiderJob implements Job, Serializable {

    public void execute(JobExecutionContext context) throws JobExecutionException {

    }
}
