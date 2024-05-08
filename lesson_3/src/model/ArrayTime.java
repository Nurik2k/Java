package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayTime {
    private ArrayList<Integer> value;

    public ArrayTime(ArrayList<Integer> value) {
        this.value = value;
    }

    public void add(int value) {
        long first = System.currentTimeMillis();
        for(int i = 0; i < value; i++) {
            this.value.add(i);
        }
        long second = System.currentTimeMillis();
        System.out.println("add " + value + " time: " + (second - first));
    }

    public List<Integer> randomValue(int size) {
        List<Integer> list = new ArrayList<>();

        long first = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            this.value.get((int)(Math.random() * (size - 1)));
        }
        list = this.value;
        long second = System.currentTimeMillis();

        System.out.println("randomValue time: " + (second - first));

        return list;
    }
}
