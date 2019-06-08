package DziennikStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student(String numerIndeksuStudenta, String imie, String nazwisko) {
        this.numerIndeksuStudenta = numerIndeksuStudenta;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeksuStudenta='" + numerIndeksuStudenta + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    private List<Double> listaOcen = new ArrayList<>();
    private String numerIndeksuStudenta, imie, nazwisko;

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public String getNumerIndeksuStudenta() {
        return numerIndeksuStudenta;
    }

    public void setNumerIndeksuStudenta(String numerIndeksuStudenta) {
        this.numerIndeksuStudenta = numerIndeksuStudenta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
