package leetcode.linkedlist;

import leetcode.tree.TreeNode;

public class Leetcode236 {
    public static boolean isPalindrome(ListNode head) {
        ListNode p = head, q = head;
        while (q.next != null && q.next.next != null){
            p = p.next;
            q = q.next.next;
        }
        if (q.next != null) q = q.next;

        ListNode mid = p;
        ListNode t = p.next;
        while (t != null){
            ListNode tmp = t.next;
            t.next = p;
            p = t;
            t = tmp;
        }

        while (q != mid){
            if (head.val != q.val) return false;
            head = head.next;
            q = q.next;
        }
        System.out.println();
        return true;
    }

    public static void main(String[] args) {
//        [1,3,2,4,3,2,1]
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        ListNode p = head;
        while (p!=null){
            System.out.println(p.val);
            p = p.next;
        }
        System.out.println(isPalindrome(head));
    }
}
