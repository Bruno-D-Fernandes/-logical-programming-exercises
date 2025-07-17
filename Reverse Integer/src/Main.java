import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        boolean flag = false;
        if (num < 0) {
            num = Math.abs(num);
            flag = true;
        }
        ArrayList<String> strNum = new ArrayList<>(List.of(String.valueOf(num).split("")));
        String reverseStrNum = "";

        for (int i = strNum.size() - 1; i >= 0; i--) {
            reverseStrNum += strNum.get(i);
        }

        if (flag) {
            reverseStrNum = "-" + reverseStrNum;
        }

        int result = Integer.valueOf(reverseStrNum);
        System.out.print(result);
    }
}