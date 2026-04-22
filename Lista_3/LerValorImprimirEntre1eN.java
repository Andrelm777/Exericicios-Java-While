package main;

import java.util.Scanner;

public class LerValorImprimirEntre1eN {

	public static void main(String[] args) {
		// Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). 
		//Considere que o N será sempre maior que ZERO.
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite o seu numero ");
	  int N = entrada.nextInt();
	  
	  int contador= 1;
		
		while (contador <= N) {
			System.out.println(contador);
			contador ++;
	  
	        }
		}
	}


