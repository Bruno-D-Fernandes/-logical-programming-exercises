import java.util.Scanner;

public class Gincana {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        long enemyTeam = ler.nextLong();
        long maxMyTeam = ler.nextLong();

        for (long i = maxMyTeam; i != 0; i--){
            if (mdc(enemyTeam, i) == 1){
                System.out.print(i);
                break;
            }
        }
    }

    public static long mdc (long a, long b){
        while (b != 0){
            long resto = b;
            b = a % b;
            a = resto;
        }

        return a;
    };


}