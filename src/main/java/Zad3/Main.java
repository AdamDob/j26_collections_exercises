package Zad3;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;

import static Zad3.Gender.FEMALE;
import static Zad3.Gender.MALE;

public class Main {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student("123","Adam", "Dob", Gender.MALE));
        students.add(new Student("123","Pawel", "Dob", Gender.MALE));
        students.add(new Student("123","Patryk", "Dob", Gender.MALE));
        students.add(new Student("123","Martyna", "Vasdob", Gender.FEMALE));
        students.add(new Student("123","Klaudia", "Dzxcob", Gender.FEMALE));
        students.add(new Student("123","Gosia", "Doasdb", Gender.FEMALE));
        students.add(new Student("123","Adam", "Dob", Gender.MALE));

        // a) wypiszemy dzieki klasie toString
        System.out.println(students);

        // b)
        System.out.println("B");
        for(Student wypisz : students){
            System.out.println(wypisz);
        }

        // c)
        System.out.println("C");
        for(Student student : students){
            if(student.getGender().equals(FEMALE)){
                System.out.println(student);
            }
        }

        // D)
        System.out.println("D");
        for(Student student : students){
            if(student.getGender().equals(MALE)){
                System.out.println(student);
            }
        }

        // e
        System.out.println("E");
        for(Student student : students){
            System.out.println(student.getNrIndeksu());
        }

    }

}
