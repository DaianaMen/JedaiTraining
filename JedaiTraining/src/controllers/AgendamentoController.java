package controllers;

import java.util.ArrayList;


import models.Agendamento;
import models.Cliente;



public class AgendamentoController {
	
	 private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();
	 
		public static boolean agendar(int matricula, String data, String hora) throws Exception {
			Cliente cliente = ClienteController.procurarPorMatricula(matricula);
			
			Agendamento agendamento = new Agendamento(cliente, data + " " + hora);
			if(agendamentos.contains(agendamento)) {
				throw new Exception("\nJá existe um agendamento para esta data\n");
			} else {
				System.out.println("Treino agendado com sucesso para o dia: " + data + " Horario: " + hora );
			}
			agendamentos.add(agendamento);	
			return true;
		}

		public static ArrayList<Agendamento> listar() {
			return agendamentos;
		}
		

	 
}
