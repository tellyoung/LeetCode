package container.Collection.List;

import java.util.Stack;

public class Yuty_Stack {
    // 堆栈 先进后出 继承Vector
    public static class MyStack{
        private Stack<Integer> stack;

        public MyStack() {
            this.stack = new Stack<>();
        }

        public void show(){
            //压栈
            for (int i = 0; i < 10; i++) {
                stack.push(i);
            }
            System.out.println(stack);

            //判断是否为空
            if (!stack.isEmpty()){
                System.out.println("is not empty!");
            }

            //弹出
            System.out.println("pop: " + stack.pop());

            //查看堆顶
            System.out.println("peek: " + stack.peek());

            //查找
            System.out.println("search: index of 7 is " + stack.search(7));
        }
    }

    public static void main(String[] args) {
        MyStack my = new MyStack();
        my.show();
    }
}
