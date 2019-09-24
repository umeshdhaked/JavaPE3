package classes.PEthree;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Frequency {
    public void find() throws IOException {
        File path = new File("FileDemo.txt");

        if(!path.exists())
        {
            OutputStream obj1 = new FileOutputStream(path);
            String str = "i am a man ,\n" +
                    "i like to sleep ,\n" +
                    "i have a home.";

            obj1.write(str.getBytes());
            obj1.close();

        }


        BufferedReader stri = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

//        int c;
//        while ((c=stri.read())!=-1) {
//            System.out.print((char) c);
//        }
        String strF;
        String Final=new String();

        while ( (strF=stri.readLine())!=null) {
            Final = Final+strF+" ";

        }

       // System.out.println(Final);
        String[] arrString = Final.split(" |\\.");



        Map<String,Integer> var = new HashMap<>();




        for (int i=0;i<arrString.length;i++){
            Integer n = var.get(arrString[i]);
            if(n==null)
                n=0;

            var.put(arrString[i],n+1);

        }




        Iterator<String> itr = var.keySet().iterator();
        Iterator<Integer> itr2 = var.values().iterator();


        while (itr.hasNext()){
            String kay=itr.next();
                if(kay.equals(",")){
                }
                else {
                    System.out.println(kay + "-" + itr2.next());
                }
        }



    }


}
