package classes.PEthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlacesWithout {
    public void setPlaces(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of places : ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> Places = new ArrayList<String>();
        while (n>0){
            String input = sc.nextLine();
            Places.add(input);
            n--;
        }


        List<String > ans = newPlaces(Places);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }


    }


    public List<String > newPlaces(List<String > var){

        List<String > ans = new ArrayList<String >();

        for(int i=0;i<var.size();i++){
          StringBuilder strB = new StringBuilder(var.get(i));
          for(int j=0;j<strB.length();j++) {
             // System.out.println(strB.charAt(j));
              if (strB.charAt(j) == 'a' || strB.charAt(j) == 'e' || strB.charAt(j) == 'i' || strB.charAt(j) == 'o' || strB.charAt(j) == 'u' || strB.charAt(j) == 'A' || strB.charAt(j) == 'E' || strB.charAt(j) == 'I' || strB.charAt(j) == 'O' || strB.charAt(j) == 'U') {
                  strB.deleteCharAt(j);
                  j=j-1;
              }
          }
          ans.add(strB.toString());
        }

        return ans;


    }






}
