/**
 * Created by i81113 on 9/7/2016.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DemoJava {
    public static void main(String[] args) {
        try{
            File file = new File("NewText.txt");
            if (!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("---------------------");
            pw.println("This is my file content");
            pw.println("---------------------");
            pw.close();
            System.out.println("Done");
            }catch (IOException e){
                e.printStackTrace();
        }
        Date date = new Date();
        System.out.println(date.toString());
    }
}
;