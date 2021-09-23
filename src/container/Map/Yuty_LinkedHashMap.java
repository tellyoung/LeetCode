package container.Map;

import java.util.LinkedHashMap;

public class Yuty_LinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println(map.keySet().toString());
        System.out.println(map.keySet().toArray()[0]);
    }
}
