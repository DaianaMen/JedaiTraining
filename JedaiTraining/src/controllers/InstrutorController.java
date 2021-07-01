package controllers;

import java.util.ArrayList;

import models.Instrutor;

public class InstrutorController {
	
	private static ArrayList<Instrutor> instrutores = new ArrayList<Instrutor>();
	private static int proximaMatricula = 1;

	public static void cadastrar(Instrutor instrutor) {
		instrutor.setMatricula(proximaMatricula++);
		instrutores.add(instrutor);
	}

	public static ArrayList<Instrutor> listar() {
		return instrutores;
	}

}
