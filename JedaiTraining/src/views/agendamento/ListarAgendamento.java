package views.agendamento;

import controllers.AgendamentoController;
import models.Agendamento;


public class ListarAgendamento {
	
	public static void renderizar() {
		System.out.println("\n== Agendamentos ==");
		for (Agendamento agendamento : AgendamentoController.listar()) {
			System.out.println("---");
			ImprimirAgendamento.imprimnirAgendamento(agendamento);
		}
	}

}
