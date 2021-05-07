package views.exercicio;

import controllers.ExercicioController;
import models.Exercicio;

public class ListarExercicio {
	public static void renderizar() {
		System.out.println("\n== Lista de Exercicios ==");
		for (Exercicio exercicio : ExercicioController.listar()) {
			System.out.println("---");
			ImprimirExercicio.imprimirExercicio(exercicio);
		}
	}
}
