package container.Collection.List;

import java.util.LinkedList;

public class Yuty_LinkedList {

    public static class MyLinkedList{
        private LinkedList<Integer> linkedList;

        public MyLinkedList() {
            this.linkedList = new LinkedList<>();
        }

        public void show(){
            for (int i = 0; i < 10; i++) {
                linkedList.add(i);
            }

            for (Integer i: linkedList) {
                System.out.print(i);
                System.out.print(' ');
            }

            System.out.println(linkedList.get(0));

            linkedList.remove(0);
            System.out.println(linkedList);

        }


    }

    public static void main(String[] args) {
        MyLinkedList my = new MyLinkedList();
        my.show();
    }
}
