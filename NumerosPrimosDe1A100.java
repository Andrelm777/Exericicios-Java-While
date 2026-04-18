package Main;

public class NumerosPrimosDe1A100 {

	public static void main(String[] args) {

		int i = 2;

	while(i <= 100) {
			int divisor = 1;
			int contador = 0;

	while (divisor <= i) {
				if (i % divisor == 0) {
					contador++;
		}
				divisor++;
		}

			if (contador == 2) {
				System.out.println(i);
		}
			i++;
		}
	}
}