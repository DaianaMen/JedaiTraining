package views.instrutor;

import java.util.Scanner;

import controllers.InstrutorController;
import models.Instrutor;
import utils.Console;

public class CadastrarInstrutor {

	private static Scanner sc = new Scanner(System.in);
	private static Instrutor instrutor;

	public static void renderizar() {
		instrutor = new Instrutor();

		System.out.println("\n== Cadastrar Cliente ==");

		System.out.print("Nome: ");
		instrutor.setNome(sc.next());

		//System.out.print("Idade: ");
		instrutor.setIdade(Console.lerInteiro("\nIdade: "));

		System.out.print("E-mail: ");
		instrutor.setEmail(sc.next());

		String sexo;
		do {
			System.out.print("Sexo [m|f]: ");
			sexo = sc.next().toLowerCase();
		} while (!sexo.equals("m") && !sexo.equals("f"));
		instrutor.setSexo(sexo);

		InstrutorController.cadastrar(instrutor);
		System.out.println("Cliente cadastrado com sucesso!!!");
	}
}
