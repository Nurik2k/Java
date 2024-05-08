package model;

public class LambdaTest {
    public void LambdaTest1(){
        Operationable operation;// interface
        operation = (x, y, z) -> x + y + z;// lambda expression

        int result = operation.calculate(10, 20, 30);
        System.out.println(result);// 60
    }

    interface Operationable{
        int calculate(int x, int y, int z);
    }
}
