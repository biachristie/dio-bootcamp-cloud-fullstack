import java.util.Scanner;

public class Desafio04_TempoDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double tmhMB = sc.nextFloat();
        //double tmhMbps = sc.nextFloat();
        double tmhMB = 80;
        double tmhMbps = 60;

    //TODO: Calcule o tempo aproximado de download

        double arquivoMb = tmhMB * 8; // conversão de Byte para bite
        double tempoDownload = (arquivoMb / tmhMbps) / 60;
        //double tempoDownload = (tmhMB/tmhMbps)/60;

   //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais

        System.out.printf("%.2f", tempoDownload);
    }
}
