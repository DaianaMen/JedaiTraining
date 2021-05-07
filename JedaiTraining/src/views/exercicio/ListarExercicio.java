package views.exercicio;

import controllers.ExercicioController;
import models.Exercicio;

public class ListarExercicio {
	public static void renderizar() {
		System.out.println("\n== Lista de Exercicios ==");
		for (Exercicio exercicio : ExercicioController.listar()) {
			System.out.println("---");
			System.out.println("Atividade: " + exercicio.getAtividade());
			System.out.println("Series: " + exercicio.getSeries());
			System.out.println("Repetições: " + exercicio.getRepeticoes());
		}
	}
}
