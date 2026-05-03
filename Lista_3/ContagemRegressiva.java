package Main;
import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um numero inteiro positivo:");
			numero = entrada.nextInt();
		} while (numero < 0);
		
		while (numero >= 0) {
			System.out.println(numero);
			numero--;
		}
	}
}