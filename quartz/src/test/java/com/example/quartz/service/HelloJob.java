package com.example.quartz.service;

import com.alibaba.fastjson.JSON;
import com.example.quartz.model.TriggerEntity;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;

import java.time.LocalDateTime;

@Slf4j
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("hello job is start execute ...");

        String  triggerEntity=(String) context.getTrigger().getJobDataMap().get("triggerEntity");
        Object sv = null;
        JobDetail jobDetail=null;
        Trigger trigger=null;
        try {
            sv = context.getScheduler().getContext().get("skey");
            jobDetail=context.getJobDetail();
            trigger=context.getTrigger();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        TriggerEntity triggerParam=JSON.parseObject(triggerEntity, TriggerEntity.class);
        log.info(JSON.toJSONString(triggerParam));
        log.info(sv.toString());
        log.info("hello:"+ LocalDateTime.now());
    }
}
