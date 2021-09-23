package leetcode.linkedlist;

import java.util.HashSet;

public class Leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        HashSet<ListNode> set = new HashSet<>();
        while (p != null){
            if (!set.contains(p)){
                set.add(p);
            } else {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
