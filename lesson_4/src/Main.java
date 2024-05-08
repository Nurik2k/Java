import model.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        number_13 n13;
//
//        n13 = (n) -> n % 13 == 0;
//        boolean b = n13.isDivideBy13(169);
//        System.out.println(b);
//
//        longer_string ls;
//        ls = (s, s2) -> s.length() > s2.length() ? s : s2;
//        String s = "Helloalwjndnalwjd";
//        String s2 = "Worldoodaodhaw";
//        System.out.println(ls.getLongerString(s, s2));
//
//        Discriminant d;
//        d = (a, f, c) -> (f * f) - (4*a*c);
//        System.out.println(d.getDiscriminant(1, 2, 3));

        ListString lst;
        lst = (list, subString) -> {
            List<String> newList = new ArrayList<>();
            for (String s : list) {
                if (s.contains(subString)) {
                    newList.add(s);
                }
            }
            return newList;
        };
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Language");
        System.out.println(lst.getListString(list, "World"));

        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply("5*3"));
        System.out.println(calculator.divide("9/3"));
        System.out.println(calculator.add("5+3"));
        System.out.println(calculator.subtract("5-3"));
    }

    interface number_13 {
        boolean isDivideBy13(int n);
    }

    interface longer_string {
        String getLongerString(String s, String s2);
    }

    interface Discriminant{
        float getDiscriminant(float a, float f, float c);
    }

    interface ListString{
        List<String> getListString(List<String> list, String subString);
    }


}