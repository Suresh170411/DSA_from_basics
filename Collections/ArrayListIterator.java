package DSA_from_basics.Collections;

import java.util.*;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sachin","ganguli","kohli","surya","hardik");

        print(list);
    }

    public static void print(List<String> list){
        Iterator<String> listIterator = list.iterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
