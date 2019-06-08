package DziennikStudent;

import java.rmi.StubNotFoundException;
import java.util.*;

public class Dziennik {

    private Map<String,Student> studentMap = new HashMap<>();


    public void dodajStudenta(Student student){
        // umiesc w mapie studenta
        //klueczem wpisu jest indeks wartoscia obiekty student

        studentMap.put(student.getNumerIndeksuStudenta(),student);
    }

    // usuwanie studneta
    public void usunStudenta(Student student){
       // Zwroc uwage - parametrem jest indeks a nie obiekt studenta
        studentMap.remove(student.getNumerIndeksuStudenta());
    }

    public void usunStudenta(String indeks){
        studentMap.remove(indeks);
    }

    public Optional<Student> zwrocStudenta(String indeks){
        if (studentMap.containsKey(indeks)){
            return Optional.ofNullable(studentMap.get(indeks));
        }
        return Optional.empty();
    }

    public Student zwrocStudenta2(String indeks) throws StubNotFoundException{
        if(studentMap.containsKey(indeks)){
            return  studentMap.get(indeks);
        }
        throw new StubNotFoundException(("Student z tym id nie isnitje"));
    }

    public double podajSredniaStudenta(String indeks) throws StubNotFoundException {
        double sum = 0.0;
        Student studentKtoregoSredniaLiczymy = zwrocStudenta2(indeks);

        for(Double ocena : studentKtoregoSredniaLiczymy.getListaOcen()){
            sum += ocena;
        }
        return sum / studentKtoregoSredniaLiczymy.getListaOcen().size();
    }

    public List<Student> zwrocZagrozonych(){
        List<Student> listaWynikowa = new ArrayList<>();

        //magia
        Set<String> kopiaIndeksow = new HashSet<>(studentMap.keySet());
        for(String indeks : kopiaIndeksow){
            try {
                if(podajSredniaStudenta(indeks) <= 2.0){
                    listaWynikowa.add(studentMap.get(indeks));
                }
            } catch (StubNotFoundException e) {
                System.out.println("Blad, nie mozna bylo odnalezc studenta");
            }
        }

        return listaWynikowa;
    }

        public List<Student> zwrocPostowanaListeStudentow(){
        // kopiuje wszystkich studentow z mapy (Wartosci) do listy.
            List<Student> studentList = new ArrayList<>(studentMap.values());

            studentList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    // 1 01> 02
                    // jestli zwrocisz 0   to o1 == o2
                    // jesli zworcis -1  to o1 < o2
                    Integer indeks1 = Integer.parseInt(o1.getNumerIndeksuStudenta());
                    Integer indeks2 = Integer.parseInt(o2.getNumerIndeksuStudenta());

                    return Integer.compare(indeks1,indeks2);
                }
            });
            return studentList;
        }

}
