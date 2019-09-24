package classes.PEthree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFolderExtentionByte {

    public void check() throws IOException {

        List<String> var = new ArrayList<>();

        File folder = new File("/home/umesh/Desktop/java/ExerciseThree");
        for (final File fileEntry : folder.listFiles()) {

         //   System.out.println(fileEntry.getName());
            if(fileEntry.getName().indexOf(".txt")!=-1)
            var.add(fileEntry.getName());

        }

       int j=0;

        while (j<=var.size()-1) {
            System.out.println("\n File Output : \n");

            File path = new File(var.get(j));

            InputStream in = new FileInputStream(path);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            j++;
        }


    }



}
