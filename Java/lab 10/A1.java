
import java.util.Scanner;

abstract class Vegetable{
    String color;

    Vegetable(String color)
    {
        this.color = color;

    }

    public String toString()
    {
        return "vegetable color:" +color;
    }
}
class Potato extends Vegetable
{

    Potato(String color) 
    {
        super(color);
    }

    public String toString()
    {
        return "potato color is :" +color;
    }
}
class Tomato extends Vegetable
{
    Tomato(String color)
    {
        super(color);
    }

    public String toString()
    {
        return "Tomato color is:" +color;
    }
} 
class Carrot extends Vegetable
{
    Carrot(String color)
    {
        super(color);
    }

    public String toString()
    {
        return "Carrot color is:" +color;
    }
}
public class A1
{
    public static void main(String[] args) 
    {
       Scanner ST=new Scanner(System.in);
       System.out.print("enter potato color:");
       String p=ST.nextLine();
       System.out.print("enter Tomato color:");
       String t=ST.nextLine();
       System.out.print("enter carrot color:");
       String c=ST.nextLine();

       Potato P1 = new Potato(p);
       Tomato T1 = new Tomato(t);
       Carrot C1 = new Carrot(c);
       
        System.out.print(P1);
        System.out.print(T1);
        System.out.print(C1);
    }
}