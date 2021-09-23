package leetcode.linkedlist;

import java.util.HashSet;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (p != null){
            if (set.contains(p)){
                return true;
            }
            set.add(p);
            p = p.next;
        }
        return false;
    }
}
