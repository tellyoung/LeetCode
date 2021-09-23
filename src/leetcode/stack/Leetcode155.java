package leetcode.stack;

import java.util.ArrayList;

public class Leetcode155 {
    /** initialize your data structure here. */
    ArrayList<Integer> array = new ArrayList<>();
    ArrayList<Integer> min = new ArrayList<>();

    public Leetcode155() {

    }

    public void push(int val) {
        array.add(val);
        if (min.size() == 0) min.add(val);
        else {
            if (min.get(min.size()-1) > val){
                min.add(val);
            } else {
                min.add(min.get(min.size()-1));
            }
        }
    }

    public void pop() {
        array.remove(array.size()-1);
        min.remove(min.size()-1);
    }

    public int top() {
        return array.get(array.size()-1);
    }

    public int getMin() {
        return min.get(min.size()-1);
    }
}
