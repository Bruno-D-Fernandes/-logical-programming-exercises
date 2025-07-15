import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class treinador {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Time> times = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            times.add(criaEquipe());
        }

        times.sort(Comparator.naturalOrder());

        for (int i = 0; i < 5; i++){
            System.out.println((i+1) + " - " + times.get(i).nomeTime + " Acertos = " + times.get(i).pontosTime + " Tempo = " + times.get(i).tempoTime);
        }

    }

    public static Time criaEquipe(){
        String nome = ler.next();
        int acertos = 0;
        int tempo = 0;

        for (int i = 0; i < 5; i++){
            acertos += ler.nextInt();
        }

        for (int i = 0; i < 5; i++){
            tempo += ler.nextInt();
        }

        return new Time(nome, acertos, tempo);
    }

    public static class Time implements Comparable<Time>{

        String nomeTime;
        int pontosTime;
        int tempoTime;

        public Time(String nomeTime, int pontosTime, int tempoTime){
            this.nomeTime = nomeTime;
            this.pontosTime = pontosTime;
            this.tempoTime = tempoTime;
        }


        @Override
        public int compareTo(Time time) {
            if (this.pontosTime - time.pontosTime == 0){
                return  this.tempoTime - time.tempoTime;
            }

            return time.pontosTime - this.pontosTime;
        }
    }

}




//NullPointer
//1 1 0 0 1
//        20 30 50 10 20
//TodoMundoNull
//1 1 1 0 0
//        30 20 50 10 25
//JRME
//1 1 0 0 1
//        20 30 50 10 10
//PauNoGato
//1 1 0 0 0
//        30 20 50 10 25
//FerroNaBoneca
//1 0 0 1 0
//        10 50 20 40 10