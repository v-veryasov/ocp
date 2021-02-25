package leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Sum {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
        System.out.println(generate(1));
    }

    public static List<List<Integer>> generate(int numRows) {
        var list = new LinkedList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
//            list.add()
        }




            list.add(List.of(1));
           list.add(List.of(1, 1));
          list.add(List.of(1, 2, 1));
         list.add(List.of(1, 3, 3, 1));
        list.add(List.of(1, 4, 6, 4, 1));
        Iterator<List<Integer>> iterator = list.descendingIterator();
        int del = 5 - Math.min(numRows, 5);
        while (iterator.hasNext() && del != 0) {
            iterator.next();
            iterator.remove();
           del--;
        }
        return list;
    }
}
