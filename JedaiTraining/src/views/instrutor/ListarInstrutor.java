package views.instrutor;

import controllers.InstrutorController;
import models.Instrutor;

public class ListarInstrutor {
	
	public static void renderizar() {
		System.out.println("\n== Lista de clientes cadastrados ==");
		for (Instrutor instrutor : InstrutorController.listar()) {
			System.out.println("---");
			ImprimirInstrutor.imprimirInstrutor(instrutor);
		}
	}

}