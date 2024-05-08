package model;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public void filter() {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");
        colors.add("purple");
        colors.add("pink");
        colors.add("black");
        colors.add("white");
        // HINT: filtration
        colors = colors.stream().filter(s -> s.equals("red")).collect(Collectors.toList());
        //Mapping
        colors = colors.stream().map(s -> s + "55").collect(Collectors.toList());
        //Sorting
        colors = colors.stream().sorted().collect(Collectors.toList());
    }

    public void queue(){
        Queue queue = new PriorityQueue();
        queue.add("red");
        queue.add("green");
        queue.add("blue");
        queue.add("yellow");
        queue.poll();

        Deque<String> deque = new ArrayDeque<>();
        deque.add("red");
        deque.addFirst("green");
        deque.addLast("blue");

        Map<String, String> map = new HashMap<>();
        map.put("red", "green");
        map.put("green", "red");
        map.put("blue", "green");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
