package br.com.final_trabalho.java;

import java.time.LocalDate;

import br.com.final_enum.DependenteException;

public class Dependente extends Pessoa {
	
	public Dependente(String nome, long cpf,LocalDate dataNascimento) throws DependenteException {
		super(nome, cpf, dataNascimento);
	}

}
