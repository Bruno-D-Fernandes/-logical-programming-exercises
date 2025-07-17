import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            while(1 != 0) {
                String gabarito = ler.nextLine();
                String resposta = ler.nextLine();

                ArrayList<String> gabaritoVetor = new ArrayList(List.of(gabarito.split(" ")));
                ArrayList<String> respostaVetor = new ArrayList(List.of(resposta.split(" ")));
                int resul = 0;

                for (int i = 0; i < gabaritoVetor.size(); i++) {
                    if (gabaritoVetor.get(i).equals(respostaVetor.get(i))) {
                        resul++;
                    }
                }

                System.out.println(resul);
            }
        } catch (Exception e) {
            //lol
            // Extretamente porco, porém funcional
        }

    }
}

//E D E A D A C B D B C A C A A A
//E A C D A D E D D A E A E B B B
//B B B C B B C D A A B A
//B B B C B B C D A A B A