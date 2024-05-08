package model;

import java.util.HashMap;
import java.util.Map;

public class MapTime {
    private Map<Integer, Integer> value;

    public MapTime(Map<Integer, Integer> value) {
        this.value = value;
    }

    public void add(int key, int value) {
        long first = System.currentTimeMillis();
        for(int i = 0; i < value; i++) {
            this.value.put(key, i);
        }
        long second = System.currentTimeMillis();
        System.out.println("add " + value + " time: " + (second - first));
    }

    public Map<Integer, Integer> randomValue(int size) {
        Map<Integer, Integer> map = new HashMap<>();

        long first = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            this.value.put((int)(Math.random() * (size - 1)), i);
        }
        map = this.value;
        long second = System.currentTimeMillis();

        System.out.println("randomValue time: " + (second - first));

        return map;
    }
}
