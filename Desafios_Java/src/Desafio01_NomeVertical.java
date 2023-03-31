import java.util.Scanner;

public class Desafio01_NomeVertical {
    public static void main(String[] args) {
        // TODO: Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        String caracteres = "";

        for (int i = 0; i < palavra.length(); i++) {
            caracteres = caracteres + palavra.charAt(i);
            System.out.println(caracteres);
        }
    }
}