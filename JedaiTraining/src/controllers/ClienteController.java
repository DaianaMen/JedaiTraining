package controllers;

import models.Cliente;
import java.util.ArrayList;

public class ClienteController {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static int proximaMatricula = 1;

	public static void cadastrar(Cliente cliente) {
		cliente.setMatricula(proximaMatricula++);
		clientes.add(cliente);
	}

	public static ArrayList<Cliente> listar() {
		return clientes;
	}

	public static Cliente procurarPorMatricula(int matricula) {
		for (Cliente cliente : clientes) {
			if (cliente.getMatricula() == matricula) {
				return cliente;
			}
		}
		return null;
	}
}
