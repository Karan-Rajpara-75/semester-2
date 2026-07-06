
import java.util.Scanner;

public class Meter
{
    public static void main(String[] args)
    {
        Scanner MF = new Scanner(System.in);
        float Meter= MF.nextFloat();
        System.out.println("Feet: " + (Meter*3.2804));    
    }
}