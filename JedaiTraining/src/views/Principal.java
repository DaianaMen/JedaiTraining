package views;

import views.cliente.CadastrarCliente;
import views.cliente.ListarCliente;
import views.cliente.ProcurarCliente;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n== Academia Jedai ==\n");
			System.out.println("11 - Cadastrar Cliente");
			System.out.println("12 - Listar Cliente");
			System.out.println("13 - Procurar Cliente");

			System.out.println("21 - Cadastrar Intrutor");
			System.out.println("22 - Listar Intrutor");

			System.out.println("31 - Agendar Treino");
			System.out.println("32 - Montar Treino");
			System.out.println("33 - Listar Treino");

			System.out.println("0 - Sair");
			System.out.print("\nDigite uma das opções: ");

			opcao = sc.nextInt();

			switch (opcao) {
				case 11:
					CadastrarCliente.renderizar();
					break;
				case 12:
					ListarCliente.renderizar();
					break;
				case 13:
					ProcurarCliente.renderizar();
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 0:
					break;
				default:

					break;
			}
		} while (opcao != 0);

		sc.close();
	}
}
