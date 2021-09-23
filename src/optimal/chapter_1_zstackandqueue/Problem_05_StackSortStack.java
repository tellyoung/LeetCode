package optimal.chapter_1_zstackandqueue;

import java.util.Stack;

public class Problem_05_StackSortStack {
    public static class StackSortStack{
        private Stack<Integer> stack;
        private Stack<Integer> help;

        public StackSortStack(Stack stack) {
            this.stack = stack;
            help = new Stack<>();
        }

        public void func(){
            while (!this.stack.isEmpty()){
                int cur = this.stack.pop();
                while (!this.help.isEmpty() && this.help.peek() < cur){
                   this.stack.push(this.help.pop());
                }
                this.help.push(cur);
            }

            while (!this.help.isEmpty()){
                this.stack.push(this.help.pop());
            }

            System.out.println(this.stack);
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(0);
        s.add(8);
        s.add(60);
        s.add(-96);

        new StackSortStack(s).func();

    }
}
