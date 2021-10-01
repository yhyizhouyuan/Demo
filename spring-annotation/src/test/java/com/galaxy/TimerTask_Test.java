package com.galaxy;

import com.galaxy.bean.MySimpleJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/27 9:53
 */
public class TimerTask_Test {
    public static void main(String[] args) throws SchedulerException {
        //testRunnable();

        //testTimerTask();

        //testExecutorService();

        testQuartz();
    }

    private static void testRunnable(){
        final long timeInternal = 10000;

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("Hello,xxx"+Thread.currentThread());
                    try {
                        Thread.sleep(timeInternal);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setName("hance");
        thread.start();
    }


    private static void testTimerTask(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello,xxx--"+Thread.currentThread());
            }
        };
        Timer timer = new Timer("Hance");
        timer.schedule(timerTask,0,5000);
    }

    private static void testExecutorService(){
        long initialDelay = 0;
        long period = 5;
        TimeUnit unit = TimeUnit.SECONDS;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello,XXX---"+Thread.currentThread());
            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(runnable,initialDelay,period,unit);
    }

    private static void testQuartz() throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(MySimpleJob.class).withIdentity("job1", "group1").build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
                .build();
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail,trigger);
        scheduler.start();
    }
}



