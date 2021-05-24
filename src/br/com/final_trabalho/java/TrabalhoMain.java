package br.com.final_trabalho.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class TrabalhoMain {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o salario do funcionário");
		double salario = ler.nextDouble();
		System.out.println("Entre com o número de dependente");
		int dependente = ler.nextInt();
		
		Funcionario teste = new Funcionario( "Clayton",  111111111, LocalDate.of(2020, 10, 10), dependente, salario );
		
		ler.close();
		System.out.println("Calcular dependente " +teste.calcularDescontoDependente());
		System.out.println("Calcular Inss " +teste.calcularInss());
		System.out.println("Calcular ir " +teste.calcularIR());
		System.out.println("salario liquido " +teste.calcularSalarioLiquido());
		System.out.println("Salario bruto " + teste.getSalarioBruto());
		
	}
	
//	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("");
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//	}
//	
//	while(subir) {
//		  
//		try {
//			verificar(cpf)
	//       adicionaDependente( dependente)
//		}catch() {
//			sysou
//		}
//	}
}
