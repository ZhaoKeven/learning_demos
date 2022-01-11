package com.example.quartz.test;

import com.alibaba.fastjson.JSON;
import com.example.quartz.model.TriggerEntity;
import com.example.quartz.service.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.quartz.DateBuilder.dateOf;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;


/**
 * simple Quartz test demo
 */
public class QuartzTest {
    public static void main(String[] args) {
        try{

            TriggerEntity<Map<String ,Object>> triggerEntity=new TriggerEntity<>();
            Map<String ,Object> map=new HashMap<>();
            map.put("t1","t1Value");
            map.put("t2","t2Value");
            map.put("t3","t3Value");
            map.put("t4","t4Value");
            triggerEntity.setData(map);
            triggerEntity.setClassName("com.example.quartz.service.HelloJob");

            Scheduler scheduler= StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();


            // define the job and tie it to our HelloJob class
            JobDetail job = newJob(HelloJob.class)
                    .withIdentity("job1", "group1")
                    .build();



            // Trigger the job to run now, and then repeat every 40 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("trigger1", "group1")
                    .usingJobData("triggerEntity", JSON.toJSONString(triggerEntity))
                    .withSchedule(simpleSchedule().withIntervalInSeconds(3)
                            .repeatForever()).build();
            // Tell quartz to schedule the job using our trigger
            Date date = scheduler.scheduleJob(job, trigger);


            TriggerEntity<Map<String ,Object>> triggerEntity2=new TriggerEntity<>();
            Map<String ,Object> map2=new HashMap<>();
            map2.put("t1","t1Value2");
            map2.put("t2","t2Value2");
            map2.put("t3","t3Value2");
            map2.put("t4","t4Value2");
            triggerEntity2.setData(map2);
            JobDataMap jobDataMap=new JobDataMap(map2);
            Trigger trigger2  = newTrigger()
                    .withIdentity("trigger7", "group1")
                    .withSchedule(simpleSchedule()
                            .withIntervalInMinutes(5)
                            .repeatForever())
                    .endAt(dateOf(22, 0, 0))
                    .build();


            JobDetail job2 = newJob(HelloJob.class)
                    .withIdentity("job2", "group1")
                    .build();

            scheduler.scheduleJob(job2, trigger2);

            scheduler.getContext().put("skey","skeyValue");

            Thread.sleep(10000*100);
            scheduler.shutdown();
        }catch(SchedulerException | InterruptedException se){
            se.printStackTrace();
        }
    }
}
