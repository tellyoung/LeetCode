package optimal.chapter_1_zstackandqueue;

import java.util.*;

public class Problem_07_SlidingWindowMaxArray {

    public static class SlidingWindowMaxArray{
        private Integer[] arr;
        private Integer w;

        public SlidingWindowMaxArray(Integer w) {
            this.w = w;
            Random random = new Random();
            this.arr = new Integer[10];
            for (int i = 0; i < 10; i++) {
                this.arr[i] = random.nextInt(10+1);
            }
        }

        public void func(){
            Stack<Integer> stack = new Stack<>();
            //boolean b = Collections.addAll(stack, this.arr);


        }

        public void getArr() {
            for (Integer i : arr) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        SlidingWindowMaxArray my = new SlidingWindowMaxArray(3);
        my.getArr();




    }

}
