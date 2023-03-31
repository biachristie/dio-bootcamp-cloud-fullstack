import java.util.Scanner;

public class Desafio05_AnoBissexto {
    public static void main(String[] args) {
        //Scanner ent = new Scanner(System.in);
        int ano = 2021;

        //TODO: Descubra se o ano é bissexto ou não
        //ano = ent.nextInt();
        boolean condicao1 = (ano % 4) == 0 && (ano % 100) != 0;
        boolean condicao2 = (ano % 4) == 0 && (ano % 100) == 0 && (ano % 400) == 0;

        if (condicao1 || condicao2) {
            System.out.println("Bissexto");
        } else {
            System.out.println("Nao Bissexto");
        }
    }
}


