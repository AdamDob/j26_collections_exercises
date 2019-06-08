package Zad3;

public class Student {

    private String nrIndeksu;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu='" + nrIndeksu + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    private String surname;

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {

        this.gender = gender;
    }

    private Gender gender;

    public Student(String nrIndeksu, String name, String surname, Gender gender) {
        this.nrIndeksu = nrIndeksu;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }



}
