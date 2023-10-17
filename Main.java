import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
try
{
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 for + and 2 for subtraction and - 3 for multiplication and 4 for division");
        int input = scanner.nextInt();


            if (input == 1) {
                Addition addition = new Addition();
            } else if (input == 2) {
                Division division = new Division();

            }  if (input == 3) {
                Multiplication multiplication = new Multiplication();
            } else {
                Subtraction subtraction = new Subtraction();
            }


        }
        catch (InputMismatchException e){
            System.out.println("invalid input");
        }
        finally {
            System.out.println("thank you for using our calculator");
        }
    }


}