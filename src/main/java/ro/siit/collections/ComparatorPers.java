package ro.siit.collections;

import java.util.Comparator;

public class ComparatorPers implements Comparator<ListExamples.Persoana> {
    @Override
    public int compare(ListExamples.Persoana o1, ListExamples.Persoana o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
