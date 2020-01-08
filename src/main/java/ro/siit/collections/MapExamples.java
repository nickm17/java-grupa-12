package ro.siit.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
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

        persoanaMap.put("Ion", ion);
        persoanaMap.put("Ghita", ghita);
        persoanaMap.put("Johnny", johnny);
        persoanaMap.put("Johnny", johnny2);// replace lui johnny

        System.out.println(persoanaMap.size());
        System.out.println(persoanaMap.get("Ion"));
        System.out.println(persoanaMap.remove("Ion"));
        System.out.println(persoanaMap.containsKey("Ion"));
        System.out.println(persoanaMap.containsKey("Ghita"));
        System.out.println(persoanaMap.containsValue(ghita));
        System.out.println(persoanaMap);



        persoanaMap.keySet().forEach(System.out::println);
        persoanaMap.values().forEach(System.out::println);
        System.out.println(persoanaMap.values());

        persoanaMap.entrySet().forEach(System.out::println);
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
    @ToString(callSuper = true)
    static class Student extends Persoana {
        private int bursa;

        public Student(String name, int bursa) {
            super(name);
            this.bursa = bursa;
        }
    }
}
