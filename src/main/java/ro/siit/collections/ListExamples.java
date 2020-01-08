package ro.siit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ListExamples {


    public static void main(String[] args) {

        List<Persoana> persoane = new ArrayList<>();
        List<Persoana> listFromArray = Arrays.asList(new Somer("",1));

        Persoana ion = new Somer("ion", 21);
        Persoana ghita = new Angajat("ghita", 58);
        Persoana johnny = new Student("johnny", 4578);
        Persoana johnny2 = new Student("johnny", 4578);

        persoane.add(ion);
        persoane.add(ghita);
        persoane.add(johnny);
        System.out.println(persoane);
        for (Persoana p : persoane) {
//            System.out.println(p.getName());
        }

        System.out.println(persoane.contains(ion));//
        System.out.println(persoane.containsAll(persoane));//
        System.out.println(persoane.get(2));
        persoane.set(0, new Somer("ionel", 21));

        persoane.forEach(persoana -> System.out.println(persoana));
        System.out.println(persoane.subList(0,2));
        System.out.println(persoane.indexOf(ghita));
        System.out.println(persoane.size());
        System.out.println(persoane.remove(ion));
        System.out.println(persoane.remove(1));
        System.out.println(persoane.isEmpty());
        persoane.clear();
        System.out.println(persoane.isEmpty());
        ((ArrayList)persoane).trimToSize();


//        Comparator<Persoana> comparatorPersoane = new Comparator<Persoana>() {
//            @Override
//            public int compare(Persoana o1, Persoana o2) {
//                return 0;
//            }
//        };
//        persoane.sort();

        List<Persoana> linkedList = new LinkedList<>();
        Queue<Persoana> queue = new LinkedList<>();
        LinkedList<Persoana> linkedList1 = new LinkedList<>();

        linkedList1.addFirst(ghita);
        linkedList1.addLast(johnny);
        linkedList1.addLast(ion);



        for (Persoana p : linkedList1) {
//            System.out.println(p.getName());
        }
        int size = linkedList1.size();
        for (int i = 0; i < size; i++) {
//            persoane.get(i);
//            System.out.println(linkedList1.poll().getName());
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
    @ToString
    static class Student extends Persoana {
        private int bursa;

        public Student(String name, int bursa) {
            super(name);
            this.bursa = bursa;
        }
    }

}
