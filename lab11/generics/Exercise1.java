package generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        String[] strs = {"a", "b", "c", "d"};
        List<String> strList = new ArrayList<>();
        addToCollection(strs, strList);

        System.out.println(strList);

        Integer[] ints = {1, 2, 3, 4};
        List<Integer> intList = new ArrayList<>();
        addToCollection(ints, intList);

        System.out.println(intList);

    }

    public static <T> void addToCollection(T[] arr, List<T> list) {
        for (T val : arr) {
            list.add(val);
        }
        System.out.println("Generic methods!");
    }

    public static void addToCollection(String[] strs, List<String> strList) {
        for (String str : strs) {
            strList.add(str);
        }
        System.out.println("String methods!");
    }

    public static void addToCollection(Integer[] strs, List<Integer> intList) {
        for (Integer i : strs) {
            intList.add(i);
        }
        System.out.println("Integer methods!");
    }
}

