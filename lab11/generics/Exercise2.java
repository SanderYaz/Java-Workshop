package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args){
        List<Number> numList = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1,2,3,4);
        copyCollection(intList,numList);
        List<Double> dList = Arrays.asList(1.3,2.0,3.5,4.0);
        copyCollection(dList,numList);

        System.out.println(numList);
    }

    public static <T> void copyCollection(List<? extends T> intList, List<T> numList){
        for (T i: intList){
            numList.add(i);
        }
    }

    public static void copyDCollection(List<Double> dList, List<Number> numList){
        for (Double i: dList){
            numList.add(i);
        }
    }
    public static void copyIntCollection(List<Integer> intList, List<Number> numList){
        for (int i: intList){
            numList.add(i);
        }
    }
}
