package Main;

public class EntreUmE_CinquentaDivisivelPorCinco {

	public static void main(String[] args) {
		// Contar quantos números entre 1 e 50 são divisíveis por 5, utilizando o laço do-while

		int i = 1;
		
			int contadorNumeroDivisivelPorCinco =0  ;
		do {
			if (i % 5 == 0) {
				System.out.println(i);	
				contadorNumeroDivisivelPorCinco++;
			}		
			
			i++;			
		}
		while(i<=50);
		System.out.println("São divisiveis por 5: "+contadorNumeroDivisivelPorCinco+" numeros !");
	}

}
