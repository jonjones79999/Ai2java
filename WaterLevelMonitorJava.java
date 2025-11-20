
/**
 * Write a description of class WaterLevelMonitorJava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WaterLevelMonitorJava
{
    public static void main(String[]arg){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the water level value.");
        int Waterlevel= sc.nextInt();

        if(Waterlevel>=1000)
        {System.out.println(" Warning the water level has risen to 1000L or more");
        }
        else if (Waterlevel>=500 )
        {System.out.println("Water level is normal");
    
        }
        sc.close();

    }
}