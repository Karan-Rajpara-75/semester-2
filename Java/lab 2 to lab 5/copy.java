
import java.util.Scanner;

public class copy{
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter a Size of array:");
        int size = st.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        for(int i=0;i<size; i++)
        {
            System.out.print("Enter a number of Array:");
            a[i]=st.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("b="+b[i]);
        }
    }
}