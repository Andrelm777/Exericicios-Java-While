package main;

public class Soma1a50 {

    public static void main(String[] args) {
        // Imprimir a soma dos números de 1 a 50

        int contador = 1;
        int soma = 0;

        while (contador <= 50) {
            soma += contador; // soma = soma + contador
            contador++;
        }

        System.out.println("Soma total: " + soma);
    }
}