package container.Collection.Queue;

import java.util.PriorityQueue;

public class Yuty_PriorityQueue {
    public static class MyPriorityQueue{
        private PriorityQueue<Integer> priorityQueue;

        public MyPriorityQueue() {
            priorityQueue = new PriorityQueue<>();
        }

        public void show(){
            for (int i = 0; i < 10; i++) {
                priorityQueue.add(i);
            }
            System.out.println(priorityQueue);

            System.out.println(priorityQueue.poll());

            priorityQueue.add(-10);

            System.out.println(priorityQueue.poll());//内部最小堆结构 每次返回最小元素
        }
    }

    public static void main(String[] args) {
        MyPriorityQueue my = new MyPriorityQueue();
        my.show();
    }
}
