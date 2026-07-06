
import java.util.Scanner;

public class ave{
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
        int sum = 0;
        for(int i=0; i<size; i++)
        {
            sum = sum + arr[i];
        }
        float ave;
        ave = sum/size;
        System.out.println("sum="+sum);
        System.out.println("ave="+ave);
    }
}