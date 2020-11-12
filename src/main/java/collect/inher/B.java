package collect.inher;

import stat.St;

import java.util.ArrayList;
import java.util.List;

public class B extends A {

    public static void main(String[] args) {
        //List<? extends A> list = new ArrayList<A>();
        //list.add(new A());
        //list.add(new B());
        List<Integer> list = new ArrayList<>();
        Integer a = 1;
        list.add(a);
        test(list);
    }

    public static void test(List<? extends Number> list) {
        //TODO: <? extends Number> - используется в сигн. методов
    }

}
