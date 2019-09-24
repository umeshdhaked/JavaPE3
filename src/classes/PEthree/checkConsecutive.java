package classes.PEthree;

import java.util.Scanner;

public class checkConsecutive {

    public String check(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split(",");
        int[] arr = new int[str.length];




        for(int i=0;i<str.length;i++)
            arr[i] = Integer.parseInt(str[i]);


        if(arr.length<2) {
            System.out.println("error");
        }
        int flag=0;
        if(arr[0]<arr[1])
            flag=1;


        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]-1 && flag==1)
                return "non consecutive numbers";
            if (arr[i]!=arr[i+1]+1 && flag==0)
                return "non consecutive numbers";

        }


return "are consecutive numbers";



    }


}
