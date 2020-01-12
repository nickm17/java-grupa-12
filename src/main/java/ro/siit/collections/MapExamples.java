package ro.siit.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Persoana> persoanaMap = new HashMap<>();
        Persoana ion = new Somer("ion", 21);
        Persoana ghita = new Angajat("ghita", 58);
        Persoana johnny = new Student("johnny", 4578);
        Persoana johnny2 = new Student("johnny3423423", 34423423);

        persoanaMap.put("Ion", ion);// pune o cheie si o valoare in Map
        persoanaMap.put("Ghita", ghita);
        persoanaMap.put("Johnny", johnny);
        persoanaMap.put("Johnny", johnny2);// replace lui johnny pentru ca exista deja

        System.out.println(persoanaMap.size());// dimensiunea
        System.out.println(persoanaMap.get("Ion"));// returneaza valoarea de la cheia respectiva
        System.out.println(persoanaMap.remove("Ion"));// sterge si returneaza valoarea de la cheia respectiva
        System.out.println(persoanaMap.containsKey("Ion"));// true daca cheia exista, foloseste hascode() si equals()
        System.out.println(persoanaMap.containsKey("Ghita"));
        System.out.println(persoanaMap.containsValue(ghita));// true daca valoarea exista, foloseste equals
        System.out.println(persoanaMap);


        // keySet() returneaza un set cu toate cheile din Map
        persoanaMap.keySet().forEach(System.out::println);
        // keySet() returneaza o colectie cu toate valorile din Map
        persoanaMap.values().forEach(System.out::println);
        System.out.println(persoanaMap.values());

        // entrySet() returneaza un set cu toate intrarile din Map
        // o intrare / entry este de forma Map.Entry<String, Persoana> , contine atat cheia cat si valoarea
        // Map.Entry are metode precum getKey() si getValue()
        persoanaMap.entrySet().forEach(System.out::println);
        persoanaMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + entry.getValue().getName()));
//        persoanaMap.forEach((k, v) -> System.out.println(v));


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
    @ToString(callSuper = true)
    static class Student extends Persoana {
        private int bursa;

        public Student(String name, int bursa) {
            super(name);
            this.bursa = bursa;
        }
    }
}
