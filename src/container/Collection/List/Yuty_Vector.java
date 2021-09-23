package container.Collection.List;

import java.util.Vector;

public class Yuty_Vector {
    public static class MyVector{
        private Vector<String> vector;

        public MyVector() {
            this.vector = new Vector<>();
        }

        public void show(){
            vector.add("b");
            vector.add("c");
            vector.add("d");
            vector.add("e");
            vector.add(0, "a");
            System.out.println(vector);
            System.out.println("capacity: " + vector.capacity());
            System.out.println("size: " + vector.size());

            vector.add("f");
            System.out.println(vector);
            System.out.println("capacity: " + vector.capacity());
            System.out.println("size: " + vector.size());

            System.out.println(vector.firstElement());
            System.out.println(vector.lastElement());

            if (!vector.isEmpty()){
                for (String s : vector) {
                    System.out.print(s + " ");
                }
            }

        }
    }

    public static void main(String[] args) {
        MyVector my = new MyVector();
        my.show();

    }
}
