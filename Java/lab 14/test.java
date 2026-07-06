
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test{

    public static void main(String[] args) throws IOException {
        try {
            File a1 = new File("java.txt");
            FileReader f=new FileReader(a1);
            int chart=0;
            int world=0;
            int line=0;
            int ch;
            while((ch=f.read())!=-1){
                chart++;
                if(ch=='\n'){
                    line++;
                }else if(ch==' '||ch=='\n'){
                    world++;
                }
            }
            System.out.println("chart:"+chart+"\nworld:"+world+"\nline:"+line);
            File a2=new File("java.txt");
            FileReader e=new FileReader(a1);
            FileWriter s=new FileWriter("java1.txt");
               Scanner w=new Scanner(System.in);
               System.out.println("enter a repl world:");
               String w1=w.nextLine();
               System.out.println("enter a repl world:");
               String w2=w.nextLine();
               String data="";
               ch=e.read();
               while(ch!=-1){
                    data+=(char) ch;
                    ch=e.read();
               }
               data=data.replaceFirst(w1,w2);
               s.write(data);
               f.close();
               s.close();

        } catch (Exception e) {
            System.out.println("not found");
        }
    }
}