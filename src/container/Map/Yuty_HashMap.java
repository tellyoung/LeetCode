package container.Map;

import java.util.HashMap;
import java.util.Map;

public class Yuty_HashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 1; i <= 10; i++) {
            map.put(i, 100-i);

            System.out.println(map.get(i));

            map.remove(i);
            map.clear();
            map.size();
        }
        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
        // 返回所有 value 值
        for(Integer value: map.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
        if (map.containsKey(3)){
            System.out.println("yes");
        }

    }
}
