package main;

import java.util.Scanner;

public class ModificacaoDoPrimeiro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;

        System.out.println("Digite um numero maior que 0: ");
        N = entrada.nextInt();

        // Continua pedindo até ser válido
        while (N <= 0) {
            System.out.println("Valor invalido! Digite outro numero maior que 0: ");
            N = entrada.nextInt();
        }

        int contador = 1;

        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }
    }
}