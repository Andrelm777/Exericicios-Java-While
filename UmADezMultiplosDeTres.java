package Main;

public class UmADezMultiplosDeTres {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {

            if (i % 3 == 0) {
                System.out.println("Os multiplos de 3 são : " + i);
            }

            i++;
        }
    }
}