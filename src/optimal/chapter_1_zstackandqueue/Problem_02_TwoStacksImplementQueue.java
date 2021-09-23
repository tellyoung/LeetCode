package optimal.chapter_1_zstackandqueue;

import java.util.Stack;

public class Problem_02_TwoStacksImplementQueue {

    public static class TwoStacksQueue {
        private Stack<Integer> input;
        private Stack<Integer> output;

        public TwoStacksQueue() {
            this.input = new Stack<>();
            this.output = new Stack<>();
        }

        public void add(int num) {
            this.input.push(num);

        }

        public int poll() {
            if (this.output.isEmpty()) {
                if (this.input.isEmpty()) {
                    System.out.println("it is null");
                } else {
                    while (!this.input.isEmpty()) {
                        this.output.push(this.input.pop());
                    }
                }
            }
            return this.output.pop();
        }

        public int peek() {
            int num = this.poll();
            this.output.push(num);
            return num;

        }
    }


    public static void main(String[] args) {
        TwoStacksQueue test = new TwoStacksQueue();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
    }
}
