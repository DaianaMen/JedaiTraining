package controllers;

import models.Treino;

import java.util.ArrayList;

public class TreinoController {

	private static ArrayList<Treino> treinos = new ArrayList<Treino>();

	public static void cadastrar(Treino treino) {
		treinos.add(treino);
	}

	public static ArrayList<Treino> listar() {
		return treinos;
	}
}
