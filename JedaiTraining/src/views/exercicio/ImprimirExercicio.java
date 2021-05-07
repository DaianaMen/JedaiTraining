package views.exercicio;

import models.Exercicio;

public class ImprimirExercicio {
	public static void imprimirExercicio(Exercicio exercicio) {
		System.out.println("Atividade: " + exercicio.getAtividade());
		System.out.println("Series: " + exercicio.getSeries());
		System.out.println("Repetições: " + exercicio.getRepeticoes());
	}
}
