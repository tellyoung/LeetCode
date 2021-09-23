package container.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Yuty_Queue_LinkedList {

    public static class MyQueue{
        private Queue<Integer> queue;

        public MyQueue() {
            queue = new LinkedList<>();
        }

        public void show(){
            for (int i = 0; i < 10; i++) {
                queue.add(i);
            }
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        MyQueue my = new MyQueue();
        my.show();
    }
}
