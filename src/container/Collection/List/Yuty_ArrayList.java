package container.Collection.List;

import java.util.ArrayList;

public class Yuty_ArrayList {

    public static class MyArrayList{
        private ArrayList<String> array;

        public MyArrayList() {
            this.array = new ArrayList<>();
        }

        public void show() {
            // 添加
            this.array.add("b");
            this.array.add("c");
            this.array.add("a");
            this.array.add("d");
            System.out.println(this.array);

            // 获取
            System.out.println("the first is " + this.array.get(0));

            // 更改
            this.array.set(0, "set 0");
            System.out.println(this.array);

            // 移除
            this.array.remove(0);
            System.out.println(this.array);

            // 容量
            System.out.println(this.array.size());

            // 遍历
            for (int i = 0; i < this.array.size(); i++) {
                System.out.println(this.array.get(i));

            }
            if (array.contains("c")){
                System.out.println("i have c");
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList me = new MyArrayList();
        me.show();
    }
}
