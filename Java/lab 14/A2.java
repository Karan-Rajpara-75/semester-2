
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A2{
    public static void main(String[] args) throws IOException{
        try {
               File a1=new File("java.txt");
               FileReader f=new FileReader(a1);
               FileWriter s=new FileWriter("java1.txt");
               Scanner w=new Scanner(System.in);
               System.out.println("enter a repl world:");
               String w1=w.nextLine();
               System.out.println("enter a reps world:");
               String w2=w.nextLine();
               String data="";
               int ch=f.read();
               while(ch!=-1){
                    data+=(char) ch;
                    ch=f.read();
               }
               data=data.replaceFirst(w1,w2);
               s.write(data);
               f.close();
               s.close();
        } 
        catch (Exception e) {
            System.out.println("not found");
        }
    }
}