package br.com.final_trabalho.java;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private long cpf;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, long cpf, LocalDate dataNascimento) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public long getCpf() {
		return cpf;
	}

	public String getNome(String nome) {
		return this.nome;
	}

	public LocalDate setDataNascimento() {
		
		
		return this.dataNascimento;
	}
	
	
	
}
