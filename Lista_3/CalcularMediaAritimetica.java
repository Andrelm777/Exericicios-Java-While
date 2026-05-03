package Main;
import java.util.Scanner;
public class CalcularMediaAritimetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int soma = 0;
		 
		while (contador < 3 ) {
			
			System.out.println("Digite um numero");
			int numero = entrada.nextInt();
			
			soma += numero;
			contador++;
		}
			float media = soma / 3.0f;
			System.out.println("A media e " + media);

	}

}
