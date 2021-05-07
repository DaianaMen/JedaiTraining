package models;

import java.util.ArrayList;

public class Treino {

	private ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
	private String treinoDesc;
	private String diaDaSemana;

	public String getTreinoDesc() {
		return treinoDesc;
	}

	public void setTreinoDesc(String treinoDesc) {
		this.treinoDesc = treinoDesc;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(ArrayList<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public void adicionarExercicio(Exercicio exercicio) {
		exercicios.add(exercicio);
	}
}
