import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainZGwiazdka {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> listZad01 = new ArrayList<>();

        System.out.println("Podaj ilosc wczytanych liczb od uzytkownika: ");
        int iloscObiektowPetliScanner = sc.nextInt();

        System.out.println("Podaj ilosc wylosowanych elemetow liczb ");
        int iloscObiektowPetliRandom = sc.nextInt();

        while(iloscObiektowPetliScanner-- > 0){
            System.out.println("Podaj liczbe: ");
            int liczbaZaladowania = sc.nextInt();
            listZad01.add(liczbaZaladowania);
        }

        while(iloscObiektowPetliRandom-- > 0){
            int liczbaZaldowania = rand.nextInt(1000);
            listZad01.add(liczbaZaldowania);
        }

        System.out.println(listZad01);

        double suma = 0;
        for(Integer eleListy : listZad01){
            suma += eleListy;
        }

        System.out.println("Suma " + suma);
        System.out.println("Srednia " + (suma/listZad01.size()));

    }
}
