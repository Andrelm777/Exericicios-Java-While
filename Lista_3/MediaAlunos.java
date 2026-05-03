package Main;
import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos:");
		int quantidade = entrada.nextInt();
		
		int contador = 0;
		float soma = 0;
		
		while (contador < quantidade) {
			System.out.println("Digite a nota do aluno:");
			float nota = entrada.nextFloat();
			
			soma += nota;
			contador++;
		}
		
		float media = soma / quantidade;
		System.out.println("A media da turma e: " + media);
	}
}