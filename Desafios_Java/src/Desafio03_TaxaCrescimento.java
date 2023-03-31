import java.util.Scanner;

public class Desafio03_TaxaCrescimento {
    public static void main(String[] args) {
        double A, B;
        //double A = 100;
        //double B = 150;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();

        double taxaCrescimentoA = 3.0D/100;
        double taxaCrescimentoB = 1.5D/100;
        int anos = 0;

    //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B
    
        do {
            A += (A * taxaCrescimentoA);
            B += (B * taxaCrescimentoB);
            anos++;
        } while (A < B);

        System.out.println(anos + " anos");

    }
}

