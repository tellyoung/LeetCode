package yuty_test;

import java.util.Scanner;

public class ACM_INOUT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //注意while处理多个case
            int a = in.nextInt();
            String b = in.next();
            System.out.println(b);
        }
    }

}
