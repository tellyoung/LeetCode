package examination.wangyi;

public class The02 {
    public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode minusList (ListNode minuendList, ListNode subtrahendList) {
        // write code here
        ListNode p=minuendList, q=subtrahendList;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (p!=null){
            s1.append(String.valueOf(p.val));
            p=p.next;
        }
        while (q!=null){
            s2.append(String.valueOf(q.val));
            q=q.next;
        }
        int i1 = Integer.parseInt(s1.toString());
        int i2 = Integer.parseInt(s2.toString());

        String res = String.valueOf(i1-i2);

        ListNode root = new ListNode(-1);
        ListNode l = root;
        for (int i = 0; i < res.length(); i++) {
            l.val = Integer.parseInt(String.valueOf(res.charAt(i)));
            if (i!=res.length()-1) l.next = new ListNode(-1);
            l = l.next;
        }
        if (res.charAt(0)=='-'){
            root.val *= -1;
        }
        return root;
    }

    public static void main(String[] args) {
        String a="-45";
        System.out.println(Integer.parseInt(a));
    }
}
