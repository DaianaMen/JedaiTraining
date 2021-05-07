package views.treino;

import controllers.TreinoController;
import models.Treino;

public class ListarTreino {

	public static void renderizar() {
		System.out.println("\n== Listar Treinos ==");
		for (Treino treino: TreinoController.listar()) {
			System.out.println("---");
			ImprimirTreino.imprimnir(treino);
		}
	}
}


