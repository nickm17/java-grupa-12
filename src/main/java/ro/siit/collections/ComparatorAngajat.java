package ro.siit.collections;

import java.util.Comparator;

public class ComparatorAngajat implements Comparator<ComparableExamples.Angajat> {
    @Override
    public int compare(ComparableExamples.Angajat o1, ComparableExamples.Angajat o2) {
        int salariuCompare = Integer.compare(o1.getSalariu(), o2.getSalariu());
        if (salariuCompare != 0) {
            return salariuCompare;
        }
        return o1.getCnp().compareTo(o2.getCnp());
    }
}
