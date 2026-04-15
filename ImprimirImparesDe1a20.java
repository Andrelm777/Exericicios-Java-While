package main;

public class ImprimirImparesDe1a20 {

    public static void main(String[] args) {
        // Imprimir os números Impares de 1 a 20

        int contador = 1;

        while (contador <= 20) {

            if (contador % 2 == 1) {
                System.out.println(contador);
            }

            contador++;
        }
    }
}