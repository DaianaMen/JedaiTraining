package views;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n-- Academia Jedai --\n");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Intrutor");
			System.out.println("3 - Montar Treino");
			System.out.println("4 - Listar Treino");
			System.out.println("5 - Agendar Treino");
			System.out.println("0 - Sair");
			System.out.println("\nDigite uma das opções:");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					CadastrarCliente.renderizar();
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
