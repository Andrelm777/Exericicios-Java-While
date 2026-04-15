package main;

public class SomaDos100 {

	public static void main(String[] args) {
		//Calcular a soma dos números de 1 a 100 usando o laço
		
		  int contador = 1;
	        int soma = 0;

	        while (contador <= 100) {
	            soma += contador; // soma = soma + contador
	            contador++;
	        }

	        System.out.println("Soma total: " + soma);

	}

}
