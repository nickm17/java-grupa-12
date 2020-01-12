package ro.siit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ListExamples {


    public static void main(String[] args) {

        List<Persoana> persoane = new ArrayList<>();
        List<Persoana> listFromArray = Arrays.asList(new Somer("",1));

        Persoana ion = new Somer("ion", 21);
        Persoana ghita = new Angajat("ghita", 58);
        Persoana ghita1 = new Angajat("gdasdhita", 58);
        Persoana ghita2 = new Angajat("aaaaghita", 58);
        Persoana ghita3 = new Angajat("ddddghita", 58);
        Persoana ghita4= new Angajat("gggghita", 58);
        Persoana johnny = new Student("johnny", 4578);
        Persoana johnny2 = new Student("johnny", 4578);

        persoane.add(ion);
        persoane.add(ghita);
        persoane.add(ghita1);
        persoane.add(ghita2);
        persoane.add(ghita3);
        persoane.add(ghita4);
        persoane.add(johnny);
        System.out.println(persoane);
        for (Persoana p : persoane) {
//            System.out.println(p.getName());
        }

        System.out.println(persoane.contains(ion));// verifica daca lista contine elementul dat ca argument , se foloseste de equals()
        System.out.println(persoane.containsAll(persoane));// verifica daca lista contine toate elementele din colectia data ca argument, se foloseste de equals()
        System.out.println(persoane.get(2));// returneaza elementul de la acel index
        persoane.set(0, new Somer("ionel", 21));// inlocuieste elementul de la indexul respectiv cu alt element

        persoane.forEach(persoana -> System.out.println(persoana));
        System.out.println(persoane.subList(0,2));// returneaza alta lista
        System.out.println(persoane.indexOf(ghita));
        System.out.println(persoane.size());// returneaza dimensiunea listei
        System.out.println(persoane.remove(ion)); // sterge un element avand chiar elementul ca argument--> equals()
        System.out.println(persoane.remove(1));// sterge elementul de la indexul respectiv
        System.out.println(persoane.isEmpty());// vefifica daca lista este goala
//        persoane.clear();// sterge toate elementele listei
        System.out.println(persoane.isEmpty());
        ((ArrayList)persoane).trimToSize();


//        Comparator<Persoana> comparatorPersoane = new Comparator<Persoana>() {
//            @Override
//            public int compare(Persoana o1, Persoana o2) {
//                return 0;
//            }
//        };

        System.out.println("========================================");
        // daca obiectul din colectie nu implementeaza Comparable , suntem obligati sa furnizam un comparator
//        persoane.sort(new ComparatorPers());// sorteaza lista conform comparatorului furnizat
        Collections.sort(persoane, new ComparatorPers());// idem. Collections este o clasa utilitara ce contine o suita de metode statice utile pentru lucrul cu colectiile
        System.out.println(persoane);

        List<Persoana> linkedList = new LinkedList<>();// de obicei folosim o referinta de tipul superclasei
        Queue<Persoana> queue = new LinkedList<>();// idem
        Deque<Persoana> linkedList1 = new LinkedList<>();// daca vrem sa accesam metode definite doar in clasa concreta, o folosim ca referinta

        // metodele astea sunt implementari ale metodelor definite in interfata Deque, deci putem folosi o referinta de acel tim
        linkedList1.addFirst(ghita);// adauga la inceputul listei
        linkedList1.addLast(johnny);// la sfarsit
        linkedList1.addLast(ion);



        for (Persoana p : linkedList1) {
//            System.out.println(p.getName());
        }
        int size = linkedList1.size();
        for (int i = 0; i < size; i++) {
//            persoane.get(i);
            System.out.println(linkedList1.poll().getName());// returneaza elemetul urmator si il elimina, null daca colectia e goala
//            System.out.println(linkedList1.poll().getName());
//            System.out.println(linkedList1.poll().getName());
//            System.out.println(linkedList1.poll().getName());

        }
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

        public Angajat(String name, int salariu) {
            super(name);
            this.salariu = salariu;
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
