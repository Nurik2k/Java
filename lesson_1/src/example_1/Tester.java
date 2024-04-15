package example_1;

import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) throws IOException {

		// variables
//    int a = 3;
//    boolean b = false;
//    float c = 2.3f;
//    double f = 2.3;
//    String d = "dviwbevibwi";
//    String e = new String("nrvienr");
//    
		// output
//    System.out.println("Hello world");
//    System.out.print("Hello world");

//    System.out.println("Fall seven times\nand\nstand up eight");
//    
//    InputStreamReader reader = new InputStreamReader(System.in);
//    BufferedReader a = new BufferedReader(reader);
//    String name = a.readLine();
//    System.out.println(name);

		// calculator
		// input: 3 5
		// output: 8
//    Scanner in = new Scanner(System.in);
//    int a = in.nextInt();
//    int b = in.nextInt();
////    System.out.println(a+b);
//    
//    Calculator myCalc = new Calculator();
//    System.out.println(myCalc.pi);
//    System.out.println(myCalc.add(a, b));
//    System.out.println(myCalc.div(a, b));
//    System.out.println(myCalc.sub(a, b));
//    //System.out.println(myCalc.mul(a, b));  // private function
//    
//    

		// task 4
		Scanner in = new Scanner(System.in);
		String num = in.next();
		in.close();
		String ans = "";
		for (int i = 0; i < num.length(); i++) {
			ans += num.charAt(num.length() - i - 1);
		}
		System.out.println("Your number: " + ans);

	}
}