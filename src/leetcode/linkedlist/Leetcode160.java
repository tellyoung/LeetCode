package leetcode.linkedlist;

public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA, pb = headB;
        while (pa != pb){
            if (pa != null){
                pa = pa.next;
            } else {
                pa = headB;
            }

            if (pb != null){
                pb = pb.next;
            } else {
                pb = headA;
            }
        }
        return pa;
    }
}
