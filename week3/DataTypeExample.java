package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        
    
        System.out.println(Integer.MAX_VALUE + "/n" + Integer.MIN_VALUE + "/n" + Integer.BYTES +"/n" + Integer.SIZE);
      
        System.out.println("fun us  \"ln\" ");
        
        byte b=13;
        byte d=15;
        byte e=(byte)(b+d);
        float f=233.3f;
        long l=200l;
        int a=70;
        float g=90.80f;
        double r=2.7778;
        int x=(int)(a+g+r);
        System.out.println(x);
        char c='A';
        System.out.println((int)c);
        int z= 50;
        System.out.println((char)z);
        int length=10;
        int breadth=20;
        int area=length*breadth;
        int p=2 *(length+breadth);
        System.out.println(area);
        System.out.println(p);
        int principle=500;
        int time=2;
        int n=2;
        float rate=2.4f;
        int SI=(int)(principle*time*rate) / 100;
        int CI= (int)(principle * Math.pow((1 + rate / n), (time * n)) - principle);
        System.out.println(SI);
        System.out.println(CI);
        
        
        
    }
}