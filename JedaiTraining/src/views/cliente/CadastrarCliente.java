package views.cliente;


import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

	private static Scanner sc = new Scanner(System.in);
	private static Cliente cliente;

	public static void renderizar() {
		cliente = new Cliente();

		System.out.println("\n== Cadastrar Cliente ==");

		System.out.print("Nome: ");
		cliente.setNome(sc.next());

		System.out.print("Idade: ");
		cliente.setIdade(sc.nextInt());

		System.out.print("E-mail: ");
		cliente.setEmail(sc.next());

		String sexo;
		do {
			System.out.print("Sexo [m|f]: ");
			sexo = sc.next().toLowerCase();
		} while (!sexo.equals("m") && !sexo.equals("f"));
		cliente.setSexo(sexo);

		ClienteController.cadastrar(cliente);
		System.out.println("Cliente cadastrado com sucesso!!!");
	}
}