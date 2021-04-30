package models;

public class Exercicio {

	private Treino treino;
	private String atividadeExercicio;
	private double series;
	private double repeticoes;
	
	public Treino getTreino() {
		return treino;
	}
	public void setTreino(Treino treino) {
		this.treino = treino;
	}
	public String getAtividadeExercicio() {
		return atividadeExercicio;
	}
	public void setAtividadeExercicio(String atividadeExercicio) {
		this.atividadeExercicio = atividadeExercicio;
	}
	public double getSeries() {
		return series;
	}
	public void setTreino(double series) {
		this.series = series;
	}
	public double getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(double repeticoes) {
		this.repeticoes = repeticoes;
	}
	
}
