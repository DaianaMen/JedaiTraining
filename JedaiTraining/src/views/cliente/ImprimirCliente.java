package views.cliente;

import models.Cliente;

public class ImprimirCliente {
	public static void imprimirCliente(Cliente cliente) {
		System.out.println("Matricula: " + cliente.getMatricula());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Sexo: " + cliente.getSexo());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("E-mail: " + cliente.getEmail());
		System.out.println("Criado em: " + cliente.getCriadoEm());
	}
}
