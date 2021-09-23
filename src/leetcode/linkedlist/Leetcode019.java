package leetcode.linkedlist;

import java.util.ArrayList;

public class Leetcode019 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> a = new ArrayList<>();
        ListNode res = head;
        ListNode p = head;
        while (p!=null){
            a.add(p);
            p = p.next;
        }
        int id = a.size()-n;
        if (a.get(id)==head){
            res = res.next;
            return res;
        }else{
            a.get(id-1).next=a.get(id).next;
            return res;
        }

    }
}
