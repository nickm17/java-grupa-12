package ro.siit.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class SetExamples {


    public static void main(String[] args) {

        Persoana ion = new Somer("ion", 21);
        Persoana ghita = new Angajat("ghita", 58, "191111111111111111111");
        Persoana ghita2 = new Angajat("ghita", 58, "191111111111111111111");
        Persoana ghita3 = new Angajat("ghita", 58, "191111111111111111111");
        Persoana ghita4 = new Angajat("ghita", 58, "191111111111111111111");
        Persoana ghita5 = new Angajat("ghita", 58, "191111111111111111111");
        Persoana johnny = new Student("johnny", 4578);
        Persoana johnny2 = new Student("johnny", 4578);

        Set<Persoana> set = new HashSet<>();
        Set<Persoana> pers = Set.of(ghita, ion);
//        pers.add(ghita4);

        System.out.println(set.add(ion));
        System.out.println(set.add(ghita));
        System.out.println(set.add(ghita2));
        System.out.println(set.add(ghita3));
        System.out.println(set.add(ghita4));
        System.out.println(set.add(ghita5));
        System.out.println(set.add(johnny));
        System.out.println(set.add(johnny));
        System.out.println(set.add(johnny2));
//        System.out.println(set.add(null));
//        System.out.println(set.add(null));

        for (Persoana p : set ) {
            System.out.println(p.getName());
        }

        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(4);
        navigableSet.add(6);
        navigableSet.add(1);
        navigableSet.add(3);

        navigableSet.forEach(System.out::println);
        System.out.println(navigableSet.ceiling(0));
        System.out.println(navigableSet.lower(6));
        System.out.println(navigableSet.floor(4));
        System.out.println(navigableSet.higher(4));

        Comparator<Angajat> angajatComparatorClasaAnonima = new Comparator<Angajat>() {
            int x = 12312;

            @Override
            public int compare(Angajat o1, Angajat o2) {
                int salariuCompare = Integer.compare(o1.getSalariu(), o2.getSalariu());
                if (salariuCompare != 0) {
                    return salariuCompare;
                }
                return o1.getCnp().compareTo(o2.getCnp());
            }

        };

//        Set<Angajat> angajati = new TreeSet<>(angajatComparatorClasaAnonima);
        Comparator<Angajat> comparatorAngajatLamda = (o1, o2) -> {
            int salariuCompare = Integer.compare(o1.getSalariu(), o2.getSalariu());
            if (salariuCompare != 0) {
//                //return salariuCompare;
            }
            return o1.getCnp().compareTo(o2.getCnp());
        };
        Set<Angajat> angajati = new TreeSet<>(comparatorAngajatLamda);

        angajati.add(new Angajat("Ion",1,"65645444554"));
        angajati.add(new Angajat("Ion",10,"12345444554"));
        angajati.add(new Angajat("Ion",12,"45645444554"));
        angajati.add(new Angajat("Ion",1,"44445444554"));
        angajati.forEach(System.out::println);// ia fiecare element din colectie si face ceva cu el, in cazul asta il printeaza
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    static abstract class Persoana {
        String name;
    }

    @Getter
    @Setter
    @ToString
    static class Angajat extends Persoana { //implements Comparable {
        private int salariu;
        private String cnp;

        public Angajat(String name, int salariu, String cnp) {
            super(name);
            this.salariu = salariu;
            this.cnp = cnp;
        }

//        @Override
//        public int compareTo(Object o) {
//            // compare in functie de cnp
////            Integer.compare(salariu, )
//            return this.cnp.compareTo(((Angajat)o).cnp);
//        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Angajat angajat = (Angajat) o;
            return salariu == angajat.salariu && this.cnp.equals(((Angajat) o).cnp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(salariu);
        }
    }

    @EqualsAndHashCode
    @ToString
    static class Somer extends Persoana {
        private int indemnizatie;

        public Somer(String name, int indemnizatie) {
            super(name);
            this.indemnizatie = indemnizatie;
        }
    }

    //@Data
    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    static class Student extends Persoana {
        private int bursa;

        public Student(String name, int bursa) {
            super(name);
            this.bursa = bursa;
        }
    }

}
