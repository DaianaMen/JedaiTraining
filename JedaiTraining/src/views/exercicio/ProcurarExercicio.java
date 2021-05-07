package views.exercicio;

import controllers.ExercicioController;
import models.Exercicio;

import java.util.Scanner;

public class ProcurarExercicio {

	private static Exercicio exercicio;
	private static Scanner sc = new Scanner(System.in);

	public static void renderizar() {

		System.out.println("\n== Procurar exercicio ==");
		System.out.print("Atividade: ");

		exercicio = ExercicioController.procurar(sc.nextLine());
		if (exercicio == null) {
			System.out.println("Exercicio não encontrado.");
			return;
		}
		ImprimirExercicio.imprimirExercicio(exercicio);
	}
}
