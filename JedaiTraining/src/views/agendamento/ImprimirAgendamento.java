package views.agendamento;

import models.Agendamento;

public class ImprimirAgendamento {
	public static void imprimnirAgendamento(Agendamento agendamento) {
		System.out.println(" Cliente: " + agendamento.getCliente().getMatricula() + 
				", Data: " + agendamento.getDataFormatada() + 
				", Hora: " + agendamento.getHoraFormatada() );
	}

}
