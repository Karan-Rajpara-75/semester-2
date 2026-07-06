import java.util.Scanner;

public class div{
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.print("enter a number:");
        int n= st.nextInt();
        int x,i;
        for(i=1; i<=n; i++)
        {
          x=i;
        if(x%2==0)
        {
            if(x%3==0)
            {   
                if(x%5==0)
                {
                    if(x%7==0)
                    {
                System.out.println("x/2 and x/3 are okay!");
                System.out.print("x:" +x);
                System.out.println("");
                System.out.println("------------------------------------");
                System.out.println("");
                    }
                }
            }
        }
        }
    }
}