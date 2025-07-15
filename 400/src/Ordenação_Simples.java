import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ordenação_Simples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(ler.nextInt());
        }

        numeros.sort(Comparator.naturalOrder());

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        numeros.sort(Comparator.reverseOrder());

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}