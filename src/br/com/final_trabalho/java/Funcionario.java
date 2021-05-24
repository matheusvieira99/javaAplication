package br.com.final_trabalho.java;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.final_enum.Calculos;

public class Funcionario extends Pessoa implements  Calculos {
	
	private double salarioBruto;
	private double descontoInss;
	private double descontoIR;
	public int dependente;
	//public ArrayList <Dependente> dependente = new ArrayList <Dependente>();
	
	
	public Funcionario(String nome, long cpf, LocalDate dataNascimento, int dependente, double salario) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.descontoInss = this.calcularInss();
		this.descontoIR = calcularIR();
		this.dependente = dependente;
		this.salarioBruto = salario;
		
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public double getDescontoInss() {
		return descontoInss;
	}
	public double getDescontoIR() {
		return descontoIR;
	}
	
//	public void adicionaDependente(Dependente dependente) {
//		
//		this.dependente.add(dependente);
//		
//		System.out.println("Dependente adicionado");
//	}

	@Override
	public double calcularInss() {
		if(this.salarioBruto < 1100.01) {
			return 0.075 * this.salarioBruto;
		}else if(this.salarioBruto < 2243.49) {
			return 0.09 * this.salarioBruto - 16.50;
		}else if(this.salarioBruto < 3305.23) {
			return 0.12 * this.salarioBruto - 82.61;
		}else if(this.salarioBruto < 6433.58) {
			return 0.14 * this.salarioBruto - 148.72;
		}else  {
			return 751.97;
		}
	}
	@Override
	public double calcularDescontoDependente() {
		
		//return this.dependente.size() * 189.59;
		return this.dependente * 189.59;
	}
	@Override
	public double calcularSalarioLiquido() {
		
		return this.salarioBruto - calcularInss() - calcularIR() ;
		
	}
	@Override
	public double calcularIR() {
		if(this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss() < 1903.99) {
			return 0;
		}else if(this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss() < 2826.66) {
			return (this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss())  * 0.075 - 142.80;
		}else if(this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss() < 3751.06) {
			return (this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss()) * 0.15 - 354.80;
		}else if(this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss() < 4664.68) {
			return (this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss()) * 0.225 - 636.13;
		}else  {
			return (this.salarioBruto - this.calcularDescontoDependente() - this.calcularInss()) * 0.275 - 869.36;
		}
		
	}
	

}
