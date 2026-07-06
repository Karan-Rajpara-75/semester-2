
import java.util.Scanner;

public class A3
{
    public static void main(String[] args) 
    {
        Scanner st =new Scanner(System.in);
        int total_A=0,total_E=0,total_I=0,total_O=0,total_U=0;
        int vowel=0;
        while (true) 
        { 
            String str=st.nextLine();
            if(str.equalsIgnoreCase("quit"))
            {
                break;
            }
            int a=0,e=0,i=0,o=0,u=0;
            for(int j=0; j<str.length();j++)
            {
                char ch = Character.toLowerCase(str.charAt(j));
                if(ch =='a')
                {
                    a++;
                }
                else if(ch == 'e')
                {
                    e++;
                }
                else if(ch == 'i')
                {
                    i++;
                    
                }
                else if(ch == 'o')
                {
                    o++;
                }
                else if(ch == 'u')
                {
                    u++;
                }
            }
            total_A += a;
            total_E += e;
            total_I += i;
            total_O += o;
            total_U += u;

            System.out.println("a:"+a+" e:"+e+" i:"+i+" o:"+o+" u:"+u);
        }
        System.out.print("total A: " +total_A);
        System.out.print("total E: " +total_E);
        System.out.print("total I: " +total_I);
        System.out.print("total O: " +total_O);
        System.out.print("total U: " +total_U);
         
        vowel= total_A + total_E + total_I + total_O + total_U;
        System.out.print("total vowel: " +vowel);
    }
}