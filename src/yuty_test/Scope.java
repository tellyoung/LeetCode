package yuty_test;

import java.util.Arrays;

public class Scope {
    public static void filed1 (int x){
        x = 8;
    }
    public static void filed2 (int[] x){ x[0] = 3;}

    public static void main(String[] args) {
        int x = 9;
        filed1(x);
        System.out.println(x);

        int[] a = {10, 3, 5, 8};
        System.out.println(Arrays.toString(a));
        filed2(a);
        System.out.println(Arrays.toString(a));

    }
}
