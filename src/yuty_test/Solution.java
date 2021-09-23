package yuty_test;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import static java.util.Objects.hash;

class Solution {
    public static void main(String[] args) {


        ArrayList<Pair<Integer, Integer>> array = new ArrayList<>();

        Pair<Integer, Integer> pair = new Pair<>(3, 4);

        HashSet<Pair<Integer, Integer>> hashset = new HashSet<>();

        hashset.add(pair);
        hashset.add(new Pair<>(5, 6));

        System.out.println(hashset);

        System.out.println(hashset.contains(new Pair<>(5,6)));

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(3,4);


        System.out.println(hashmap.entrySet());

        System.out.println(Integer.toString(10, 2));


    }
}
