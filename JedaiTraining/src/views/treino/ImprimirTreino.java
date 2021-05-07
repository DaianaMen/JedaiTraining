package views.treino;

import models.Exercicio;
import models.Treino;

public class ImprimirTreino {
	public static void imprimnir(Treino treino) {
		System.out.println("Descrição: " + treino.getTreinoDesc());
		System.out.println("Dia da Semana: " + treino.getDiaDaSemana());
		System.out.println("Exercicios:");
		for (Exercicio exercicio : treino.getExercicios()) {
			System.out.println(" - " + exercicio.getAtividade() + " " +
					exercicio.getSeries() + "x" + exercicio.getRepeticoes());
		}
	}
}
