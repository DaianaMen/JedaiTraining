package views.cliente;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

import java.util.Scanner;

public class ProcurarCliente {

	private static Scanner sc = new Scanner(System.in);
	private static int matricula;
	private static Cliente cliente;

	public static void renderizar() {
		System.out.println("\n== Procurar Cliente ==");
		System.out.print("Matricula: ");
		matricula = Console.lerInteiro("");

		cliente = ClienteController.procurarPorMatricula(matricula);
		ImprimirCliente.imprimirCliente(cliente);
	}
}
