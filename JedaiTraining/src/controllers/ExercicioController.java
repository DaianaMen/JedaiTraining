package controllers;

import models.Exercicio;

import java.util.ArrayList;

public class ExercicioController {

	private static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

	public static void cadastrar(Exercicio exercicio) throws Exception {
		if (procurar(exercicio.getAtividade()) != null) {
			throw new Exception("Atividade já cadastrada");
		}
		exercicios.add(exercicio);
	}

	public static ArrayList<Exercicio> listar() {
		return exercicios;
	}

	public static Exercicio procurar(String atividade) {
		for (Exercicio exercicio: exercicios) {
			if (exercicio.getAtividade().equals(atividade)) {
				return exercicio;
			}
		}
		return null;
	}
}
