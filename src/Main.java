import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("D:\\+EPAM На сдачу\\IO_3\\src\\input");
        FileWriter fw = new FileWriter("D:\\+EPAM На сдачу\\IO_3\\src\\output");
        BufferedReader janus = new BufferedReader(fr);

        String data;

        while ((data = janus.readLine()) != null){
            String[] words = data.split(" ");
            for(String a: words){
                StringBuilder builder=new StringBuilder(a);
                 fw.write(" "+builder.reverse().toString());
            }
        }
        fr.close();
        fw.close();
    }  }