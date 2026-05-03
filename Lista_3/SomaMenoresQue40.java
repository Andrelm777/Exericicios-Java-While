package Main;
import java.util.Scanner;

public class SomaMenoresQue40 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o numero " + (i + 1) + ":");
			int numero = entrada.nextInt();
			
			if (numero < 40) {
				soma += numero;
			}
		}
		
		System.out.println("A soma dos numeros menores que 40 e: " + soma);
	}
}