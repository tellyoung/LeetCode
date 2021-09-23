package leetcode.linkedlist;

public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = head, end = head.next;
        while (end != null){
            ListNode tmp = end.next;
            end.next = pre;
            if (pre == head) pre.next = null;
            pre = end;
            end = tmp;

        }
        return pre;
    }
}
