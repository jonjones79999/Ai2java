
/**
 * Write a description of class Week2Auserinput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Week2Auserinput
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        
        int sum=firstNumber+secondNumber;
        System.out.println("Sum of two number is"+sum);
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        System.out.println("The greatestNumber is "+bigger);
        sc.close();
    }
}
  