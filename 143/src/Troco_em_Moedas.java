import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Troco_em_Moedas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> moedas = new ArrayList<>(Arrays.asList(100, 50, 25, 10, 5, 1));
        int[] qtdMoedas = new int[6];

        int valorCentavos = ler.nextInt();

        for (int i = 0; i < moedas.size(); i++) {
            int moedaAtual = moedas.get(i);

            int quantidadeDaMoeda = valorCentavos / moedaAtual;
            qtdMoedas[i] = quantidadeDaMoeda;
            valorCentavos %= moedaAtual;
        }

        int quantiaTotal = 0;
        for (int valor : qtdMoedas) {
            quantiaTotal += valor;
        }

        System.out.println(quantiaTotal);
        for (int valor : qtdMoedas) {
            System.out.println(valor);
        }
    }
}