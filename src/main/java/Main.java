import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> listZad01 = new ArrayList<>();

        int a = 5;
        double sum = 0;

        while(a>0) {
            listZad01.add(sc.nextInt());
            listZad01.add(rand.nextInt(10));

            a--;
        }

        for(Integer elementyListy : listZad01){
            sum += elementyListy;
        }

        System.out.println(listZad01);
        System.out.println("Suma " + sum);
        System.out.println("srednia " + sum / listZad01.size());
    }

}
