package com.exemplo.patterns.observer.jobs;

import com.exemplo.patterns.observer.modelos.Lancamento;
import com.exemplo.patterns.observer.notificador.Notificador;
import com.exemplo.patterns.observer.repositorio.Lancamentos;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;

public class LancamentosVencidosJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		
		Lancamentos lancamentos = (Lancamentos) jobDataMap.get("lancamentos");
		Notificador notificador = (Notificador) jobDataMap.get("notificador");
		
		List<Lancamento> lancamentosVencidos = lancamentos.vencidos();
		notificador.novosLancamentosVencidos(lancamentosVencidos);
	}

}