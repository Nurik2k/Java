package model;

import java.util.List;

public class Calculator {

    public Calculator() {
    }

    public int add(String str){
        List<String> str2 = List.of(str.split("\\+")) ;
        Integer a = Integer.parseInt(str2.get(0));
        Integer b = Integer.parseInt(str2.get(1));

        return a + b;
    }

    public int subtract(String str){
        List<String> str2 = List.of(str.split("-"));
        Integer a = Integer.parseInt(str2.get(0));
        Integer b = Integer.parseInt(str2.get(1));

        return a - b;
    }

    public int multiply(String str){
        List<String> str2 = List.of(str.split("\\*"));
        Integer a = Integer.parseInt(str2.get(0));
        Integer b = Integer.parseInt(str2.get(1));

        return a * b;
    }

    public int divide(String str){
        List<String> str2 = List.of(str.split("/"));
        Integer a = Integer.parseInt(str2.get(0));
        Integer b = Integer.parseInt(str2.get(1));

        return a / b;
    }
}
