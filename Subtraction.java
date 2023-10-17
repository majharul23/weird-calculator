import java.util.Scanner;

public class Subtraction {

   public double Calculator;{

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        double num1 = scanner.nextDouble();


                Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter num2");
        double num2 = scanner1.nextDouble();

        double result = num1 - num2;

        System.out.println("the subtraction is: "+result);
    }

}
