package model;

public class StringTest {
    public void StringTest1(){
        String str = new String("Hello, World");
        String str2 = "asd";
        String str3 = new String(new char[]{'a', 's', 'd'});

        str.compareTo(str2); // return boolean
        str.toLowerCase().toUpperCase();
        str.split(","); // return array
        str.replace("Hello", "Hi");
        str.replaceAll("Hello", "Hi");
        str.trim();
        str.substring(0, 3); // return string
        str.length();
        str.charAt(0); // return char
        str.indexOf("Hello"); // return int
        str.lastIndexOf("Hello");
        str.contains("Hello");
        str.startsWith("Hello");
        str.endsWith("Hello");
    }
}
