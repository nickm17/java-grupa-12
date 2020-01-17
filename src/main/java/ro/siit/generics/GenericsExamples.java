package ro.siit.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {

    public static <E> void aaaa (List<E> list){
        if (list instanceof ArrayList<?>){
        }
    }

    // https://stackoverflow.com/questions/7335018/cannot-perform-instanceof-check-against-parameterized-type-arraylistfoo

//    public static <E> void bbbb (List<E> list){
//        if (list instanceof ArrayList<Integer>){ // nu compileaza deoarece genericele sunt folosite doar la compilare
//        }                                         // la runtime ele dispar (type erasure)
//    }
    public static <E> void cccc (List<E> list){
        if (list instanceof ArrayList){
        }
    }
}
