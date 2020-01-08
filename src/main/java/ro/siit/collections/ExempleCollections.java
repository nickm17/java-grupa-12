//package ro.siit.collections;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Queue;
//import java.util.Set;
//
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//abstract class Persoana {
//    String name;
//}
//
//@Data
//@ToString
//class Angajat implements Persoana {
//    private String name;
//    private int salariu;
//
//    public Angajat(String name, int salariu) {
//        this.name = name;
//        this.salariu = salariu;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSalariu() {
//        return salariu;
//    }
//
//    public void setSalariu(int salariu) {
//        this.salariu = salariu;
//    }
//}
//
//public class ExempleCollections {
//
//
//    public static void main(String[] args) {
//
//        List<Persoana> persoanas = new ArrayList<>();
//
//        Persoana ion = new Somer("ion", 21);
//        Persoana ghita = new Angajat("ghita", 58);
//        Persoana johnny = new Student("johnny", 4578);
//        Persoana johnny2 = new Student("johnny", 4578);
//
//        persoanas.add(ion);
//        persoanas.add( ghita);
//        persoanas.add(johnny);
//
//        for (Persoana p : persoanas) {
////            System.out.println(p.getName());
//        }
//
//        List<Persoana> linkedList = new LinkedList<>();
//        Queue<Persoana> queue = new LinkedList<>();
//        LinkedList<Persoana> linkedList1 = new LinkedList<>();
//
//        linkedList1.addFirst(ghita);
//        linkedList1.addLast(johnny);
//        linkedList1.addLast(ion);
//
//        for (Persoana p: linkedList1) {
////            System.out.println(p.getName());
//        }
//        int size = linkedList1.size();
//        for (int i = 0 ; i < size; i++){
////            persoanas.get(i);
////            System.out.println(linkedList1.poll().getName());
////            System.out.println(linkedList1.poll().getName());
////            System.out.println(linkedList1.poll().getName());
////            System.out.println(linkedList1.poll().getName());
//
//        }
//
//
//        Set<Persoana> set = new HashSet<>();
//        System.out.println(set.add(ion));
//        System.out.println(set.add(ghita));
//        System.out.println(set.add(johnny));
//        System.out.println(set.add(johnny));
//        System.out.println(set.add(johnny2));
////        System.out.println(set.add(null));
////        System.out.println(set.add(null));
//
//        for (Persoana p : set ) {
//            System.out.println(p.getName());
//        }
//
//    }
//
//
//}
//
//@Data
//@ToString
//class Somer implements Persoana {
//    private int indemnizatie;
//    private String name;
//
//    public Somer(String name, int indemnizatie) {
//        this.name = name;
//        this.indemnizatie = indemnizatie;
//    }
//
//    public int getIndemnizatie() {
//        return indemnizatie;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
////@Data
//@ToString
//class Student implements Persoana {
//    private int bursa;
//    private String name;
//
//    public Student(String name, int bursa) {
//        this.name = name;
//        this.bursa = bursa;
//    }
//
//    public int getBursa() {
//        return bursa;
//    }
//
//    public void setBursa(int bursa) {
//        this.bursa = bursa;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return bursa == student.bursa &&
//                name.equals(student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(bursa, name);
//    }
//}