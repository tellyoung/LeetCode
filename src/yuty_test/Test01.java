package yuty_test;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Test01 {

    public static void main(String[] args) {
        HashSet<Pair<String, String>> set = new HashSet<>();
        set.add(new Pair<>("yu", "ty"));
        set.add(new Pair<>("suc", "css"));
        Object[] a = set.toArray();
        System.out.println(set);
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet treeSet = new TreeSet<>();
        treeSet.add(new Test());

    }
    
}
