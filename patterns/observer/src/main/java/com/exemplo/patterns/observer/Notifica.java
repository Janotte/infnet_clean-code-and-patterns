package com.exemplo.patterns.observer;

import com.exemplo.patterns.observer.jobs.LancamentosVencidosJob;
import com.exemplo.patterns.observer.notificador.Notificador;
import com.exemplo.patterns.observer.notificador.NotificadorLancamentosVencidos;
import com.exemplo.patterns.observer.observadores.EmailListener;
import com.exemplo.patterns.observer.observadores.Listener;
import com.exemplo.patterns.observer.observadores.SMSListener;
import com.exemplo.patterns.observer.repositorio.Lancamentos;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Notifica {

    public static void main(String[] args) throws Exception {

        Notificador notificador = new NotificadorLancamentosVencidos();

        Listener enviadorEmail = new EmailListener(notificador);
        Listener enviadorSms = new SMSListener(notificador);

        JobDataMap jobDataMap = new JobDataMap();
        Lancamentos lancamentos = new Lancamentos();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentos", lancamentos);
        jobDataMap.put("notificador", notificador);

        JobDetail job = newJob(LancamentosVencidosJob.class)
                .setJobData(jobDataMap)
                .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
                .build();

        //Notifica a cada 60 segundos
        CronTrigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0 * * * * ?"))
                .build();

        scheduler.scheduleJob(job, trigger);

        scheduler.start();

        Thread.sleep(220000);

        scheduler.shutdown(true);

    }
}
