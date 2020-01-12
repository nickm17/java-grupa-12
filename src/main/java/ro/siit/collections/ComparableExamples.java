package ro.siit.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ComparableExamples {

    public static void main(String[] args) {
        // avem 3 moduri in care putem implementa metoda comapare
        // 1- clasa anonima
        Comparator<Angajat> angajatComparatorClasaAnonima = new Comparator<Angajat>() {
            @Override
            // aici furnizam modul custom de comparare dorit
            public int compare(Angajat o1, Angajat o2) {
                // comparam salariile
                int salariuCompare = Integer.compare(o1.getSalariu(), o2.getSalariu());
                // daca salariile sunt diferite returnam
                if (salariuCompare != 0) {
                    return salariuCompare;
                }
                // daca salariile sunt egale comparam si cnp-urile
                return o1.getCnp().compareTo(o2.getCnp());
            }

        };

        // 2- lambda expression
        Comparator<Angajat> comparatorAngajatLamda = (o1, o2) -> {
            int salariuCompare = Integer.compare(o1.getSalariu(), o2.getSalariu());
            if (salariuCompare != 0) {
//                //return salariuCompare;
            }
            return o1.getCnp().compareTo(o2.getCnp());
        };

        // 3 - o clasa noua ce implementeaza interfata
        ComparatorAngajat comparatorAngajat = new ComparatorAngajat();

//        Set<Angajat> angajati = new TreeSet<>(angajatComparatorClasaAnonima);
        Set<Angajat> angajati = new TreeSet<>(comparatorAngajatLamda);
//        Set<Angajat> angajati = new TreeSet<>(comparatorAngajat);

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
    @EqualsAndHashCode
    @ToString(callSuper = true)
    static class Angajat extends Persoana {
        private int salariu;
        private String cnp;

        public Angajat(String name, int salariu, String cnp) {
            super(name);
            this.salariu = salariu;
            this.cnp = cnp;
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString(callSuper = true)
    static class Somer extends Persoana {
        private int indemnizatie;

        public Somer(String name, int indemnizatie) {
            super(name);
            this.indemnizatie = indemnizatie;
        }
    }

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
