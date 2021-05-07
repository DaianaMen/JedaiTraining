package views.treino;

import controllers.ExercicioController;
import controllers.TreinoController;
import models.Exercicio;
import models.Treino;

import java.util.Scanner;

public class MontarTreino {

	private static Scanner sc = new Scanner(System.in);
	private static Treino treino;
	private static Exercicio exercicio;
	private static String atividade;
	private static String opcao;

	public static void renderizar() {
		treino = new Treino();
		System.out.println("\n== Montar Treino ==");

		System.out.print("Descrição: ");
		treino.setTreinoDesc(sc.nextLine());

		System.out.print("Dia da semana: ");
		treino.setDiaDaSemana(sc.nextLine());

		do {
			System.out.print("Atividade: ");
			atividade = sc.nextLine();
			exercicio = ExercicioController.procurar(atividade);

			if (exercicio == null) {
				System.out.println("Exercicio não encontrado");
			} else {
				treino.adicionarExercicio(exercicio);
			}

			System.out.print("Adicionar outra atividade? (s/n) ");
			opcao = sc.nextLine().toLowerCase();
		} while (opcao.equals("s"));

		TreinoController.cadastrar(treino);
	}
}
