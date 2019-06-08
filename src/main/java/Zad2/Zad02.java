package Zad2;

import java.util.*;

public class Zad02 {

    public static void main(String[] args) {

        List<Integer> zad2 = new ArrayList<>();


        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a = 13;

        while (a-- > 0) {
            zad2.add(rand.nextInt(1000));
        }

        double suma = 0;
        for (Integer ele : zad2) {
            suma += ele;
        }
        System.out.println("suma" + suma);
        System.out.println("Srednia = " + (suma / zad2.size()));

        List<Integer> zad2Kopia = new ArrayList<>(zad2);
        Collections.sort(zad2Kopia);
        System.out.println(zad2Kopia);
        if (zad2Kopia.size() % 2 == 0) {
            int indeksLewySrodkowy = ((zad2Kopia.size() / 2) - 1);
            int indeksPrawySrodkowy = (zad2Kopia.size() / 2);

            double mediana = ((zad2Kopia.get(indeksLewySrodkowy)) + zad2Kopia.get(indeksPrawySrodkowy)) / 2.0;
            System.out.println("Mediana = " + mediana);
        } else {
            int indeksSrodkowy = (zad2Kopia.size() / 2);
            int mediana = zad2Kopia.get(indeksSrodkowy);
            System.out.println("Mediana = " + mediana);
        }

        //najwiekszy i najmiejszy element
        System.out.println();
        int najmniejszy = zad2.get(0);
        int najwiekszy = zad2.get(0);
        for (Integer obecny : zad2) {
            if (najmniejszy > obecny) {
                najmniejszy = obecny;
            }
            if (najwiekszy < obecny) {
                najwiekszy = obecny;
            }

        }
        System.out.println("Min = " +  najmniejszy);
        System.out.println("Max = " +  najwiekszy);

        //Znajdowanie indeksu minimalnego i maksymalnego
        int indexMax = 0;
        int indexMin = 0;
        for(int i=0; i<zad2.size(); i++){
            if(najwiekszy == zad2.get(i)){
                indexMax = i;
            }
            if(najmniejszy == zad2.get(i)){
                indexMin = i;
            }
        }

        //zajnodwanie min i max
        System.out.println("Index max (indexof): " + zad2.indexOf(indexMax));
        System.out.println("Index min (indexof): " + zad2.indexOf(indexMin));

    }
}