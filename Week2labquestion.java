
/**
 * Write a description of class Week2labquestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Week2labquestion
{ 
    public static void main(String[]arg)
    {
        System.out.println("My name is :");
        System.out.println("Tshering");
        String name="Tshering";
        System.out.println("My name is " +name);
        
        int a=10;
        int b=10;
        System.out.println(++a);
        System.out.println(a++);
        int Studentage=19;
        String StudentName="Irbax";
        float GPA=3.6f;
        
         Scanner sc = new Scanner(System.in); // create scanner object
        System.out.println("Enter your name: ");
        String inputName = sc.nextLine(); // take input as text
        System.out.println("Your entered name is: " + inputName);
        System.out.println("Age:" +Studentage);
        System.out.println("GPA:" +GPA);

        
    }
               
    }
    
