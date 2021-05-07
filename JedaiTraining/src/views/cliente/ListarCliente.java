package views.cliente;

import controllers.ClienteController;
import models.Cliente;

public class ListarCliente {

	public static void renderizar() {
		System.out.println("\n== Lista de clientes cadastrados ==");
		for (Cliente cliente : ClienteController.listar()) {
			System.out.println("---");
			ImprimirCliente.imprimirCliente(cliente);
		}
	}

}
