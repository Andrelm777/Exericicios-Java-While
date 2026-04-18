package Main;

public class QuadradosDe1a10 {
	public static void main(String[] args) {
		// Imprimir os quadrados dos números de 1 a 10 utilizando o laço
		int i = 1;

		do {
			int quadrado = i * i;
			System.out.println(quadrado);
			i++;
		} while (i <= 10);

	}
}