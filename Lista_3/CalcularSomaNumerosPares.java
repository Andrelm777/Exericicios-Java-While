package Main;
import java.util.Scanner;

public class CalcularSomaNumerosPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			System.out.println("Entre com um numero inteiro positivo");
			numero = entrada.nextInt(); 
		} while (numero <= 0);
			
		int contador = 1;
		int soma = 0;
		
		while (contador <= numero) {
			if (contador % 2 == 0) {
				soma += contador;
			}
			contador++;
		}
		
		System.out.println("A soma dos numeros pares e " + soma);
	}
}