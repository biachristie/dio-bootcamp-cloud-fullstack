import java.util.Scanner;

public class Desafio02_LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double areaCoberta = scanner.nextDouble();
        double areaCoberta = 100;

        double volumeLata = 18.0D;
        double volumeGalao = 3.6D;
        double valorLata = 80.0D;
        double valorGalao = 25.0D;

        double quantidadeTinta = (areaCoberta / 6);
        double quantidadeLatas = Math.ceil(quantidadeTinta / volumeLata);
        double quantidadeGaloes = Math.ceil(quantidadeTinta / volumeGalao);

    // TODO: Utilize a função Math.ceil() para arredondamento

        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }
}