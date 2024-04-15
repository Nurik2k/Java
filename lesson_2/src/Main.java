import model.Person;
import model.Vector;

public class Main {
    public static void main(String[] args) {

//        // Task 1
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i);
//        }
//
//        // Task 2
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//
//        // Task 3
//        int result = 1;
//        for (int i = 1; i <= 5; i++) {
//            result *= i;
//        }
//        System.out.println(result);

//        Person person = new Person("John", 20);
//        System.out.println(person.getName());
//        person.setName("Jack");
//        System.out.println(person.getName());
//        System.out.println(person.getAge());

        Vector vector = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        System.out.println(vector.getX());
        System.out.println(vector.getY());
        System.out.println(vector.getZ());

        System.out.println(vector.getSqrt(vector2));
        System.out.println(vector.getDistance(vector2));
        System.out.println(vector.getAngle(vector2));
        System.out.println(vector.getScalarProduct(vector2));

        System.out.println(vector.subtract(vector2));
        System.out.println(vector.divide(vector2));
        System.out.println(vector.multiply(vector2));
        System.out.println(vector.sum(vector2));

        System.out.println(vector.getRandomVectors(3));
    }
}