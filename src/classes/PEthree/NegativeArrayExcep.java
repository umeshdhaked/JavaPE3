package classes.PEthree;

import java.util.Scanner;

public class NegativeArrayExcep {

    public void check(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        sc.nextLine();

        try {
            String[] str = new String[n];
        }
        catch (NegativeArraySizeException e){
            System.out.println("lol :) "+e);
        }




    }




}
