
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A1 {

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

        } catch (Exception e) {
            System.out.println("not found");
        }
    }
}
