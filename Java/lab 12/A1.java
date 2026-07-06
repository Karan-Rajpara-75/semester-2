//Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds Exception using try-catch block. 
public class A1{
    public static void main(String[] args) {
        try{
            int a=1/0;
        }
        catch(ArithmeticException e){
            System.out.print("Arithmetic Exception");
        }
        System.out.println("\n");

        try{
            int arr[] = new int[4];
            arr[100] = 540;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.print("Array Index Out Of Bounds Exception"); 
        }
    }
}