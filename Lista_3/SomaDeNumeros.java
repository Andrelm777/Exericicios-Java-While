package Main;
import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o numero " + (i + 1) + ":");
			int numero = entrada.nextInt();
			
			soma += numero;
		}
		
		System.out.println("A soma total dos numeros e: " + soma);
	}
}