package Main;
import java.util.Scanner;

public class EscreverQuantosSaoNegativos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		int negativos = 0;
		
		while (contador < 10) {
			System.out.println("Digite um numero:");
			int numero = entrada.nextInt();
			
			if (numero < 0) {
				negativos++;
			}
			
			contador++;
		}
		
		System.out.println("Quantidade de numeros negativos: " + negativos);
	}
}