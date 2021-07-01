package views.instrutor;

import models.Instrutor;

public class ImprimirInstrutor {
	public static void imprimirInstrutor(Instrutor instrutor) {
		System.out.println("Matricula: " + instrutor.getMatricula());
		System.out.println("Nome: " + instrutor.getNome());
		System.out.println("Sexo: " + instrutor.getSexo());
		System.out.println("Idade: " + instrutor.getIdade());
		System.out.println("E-mail: " + instrutor.getEmail());
		System.out.println("Criado em: " + instrutor.getCriadoEm());
	}

}
