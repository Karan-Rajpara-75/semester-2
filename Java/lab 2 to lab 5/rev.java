
import java.util.Scanner;

public class rev{
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter a Size of array:");
        int size = st.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size; i++)
        {
            System.out.print("Enter a number of Array:");
            arr[i]=st.nextInt();
        }
        int temp;
        for(int i=0;i<size/2; i++)
        {
            temp = arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1] = temp;           
        }
        for(int i=0; i<size; i++)
        {
            System.out.println("rev="+arr[i]);
        }
    }
}