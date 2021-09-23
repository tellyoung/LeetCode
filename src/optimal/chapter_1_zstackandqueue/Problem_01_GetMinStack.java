package optimal.chapter_1_zstackandqueue;

import java.util.Stack;

public class Problem_01_GetMinStack {

    public static class MyStack{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack(){
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        public void push(int num){
            if (this.stackData.isEmpty()){
                this.stackMin.push(num);
            } else if (num > stackMin.peek()){
                this.stackMin.push(stackMin.peek());
            } else {
                this.stackMin.push(num);
            }
            this.stackData.push(num);
        }

        public int pop(){
            this.stackMin.pop();
            return this.stackData.pop();
        }

        public int getMin(){
            return this.stackMin.peek();
        }
    }


    public static void main(String[] args) {
        MyStack s1 = new MyStack();
        s1.push(3);
        System.out.println(s1.getMin());
        s1.push(4);
        System.out.println(s1.getMin());
        s1.push(1);
        System.out.println(s1.getMin());
        System.out.println(s1.pop());
        System.out.println(s1.getMin());
        // 3 4 1
        // 3 4
    }
}
