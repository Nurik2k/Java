import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        model.ArrayTime arrayTime = new model.ArrayTime(new ArrayList<>());
        arrayTime.add(10000000);
        arrayTime.randomValue(1000000);

        model.MapTime mapTime = new model.MapTime(new HashMap<>());
        mapTime.add(1, 10000000);
        mapTime.randomValue(1000000);
    }


}