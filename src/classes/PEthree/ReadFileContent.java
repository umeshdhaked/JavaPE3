package classes.PEthree;

import java.io.*;

public class ReadFileContent {

    public void readFiles() throws IOException
    {

        File name = new File("Hello.txt");

        if(!name.exists()) {
            OutputStream obj1 = new FileOutputStream(name);
        }

       BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        String str;
        int length=0;
        while ((str=reader.readLine())!=null){
            System.out.println(str.toUpperCase());
            length=length+1;
        }

        System.out.println("\n"+length);


    }









}
