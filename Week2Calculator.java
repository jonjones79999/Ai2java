
/**
 * Write a description of class Week2Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Week2Calculator
{
    public static void main(String[]arg){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter First number");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second number");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operator(+, -, *, /):");
        char operator= sc.next().charAt(0);

        double result=0.0;
        switch(operator){
            case '+':
                result= num1 +num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
                case'/':
                if(num2!=0)
                    result = num1/num2;
                else{
                    System.out.println("Error: Divison by zero");
                    sc.close();
                    return;
                }
        }

        System.out.println("Result:" +result);
        sc.close();
    }
}

    
    
