import java.util.Scanner;

public class testkaran{
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.print("loop number:");
        int n=st.nextInt();
        int j;
        for(j=1; j<=n; j++)
        {
            int x;
            x=j;
            int i, y=1;
            for(i=0;i<x;i++)
            {
                y=y*x;
            }
            int b;
            b=x*x;
            // System.out.println("x:" +x);
            if(b==y)
            {
                System.out.println("x:" +x);
                System.out.println("root and multiplay are same");
            }
            // else
            // {
            //     System.out.println("root and multiplay are not same");
            // }
        }
    }
}