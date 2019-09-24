package classes.PEthree;

import java.util.Scanner;

public class addTwoMatrix {


    public void setMatrix(){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Rows : ");
        int r1 = sc.nextInt();
        System.out.print("\n Column : ");
        int c1= sc.nextInt();



        System.out.println("For Matrix 1 :");
        int[][] mat1= new int[r1][c1];
        for(int i=0;i<r1;i++)
        for (int j=0;j<c1;j++)
        {
            input=sc.nextInt();
            mat1[i][j]=input;
        }


        System.out.println("For Matrix 2 :");
        int[][] mat2= new int[r1][c1];
        for(int i=0;i<r1;i++)
            for (int j=0;j<c1;j++)
            {
                input=sc.nextInt();
                mat2[i][j]=input;
            }



       int[][] result= addedMatrix(r1,c1,mat1,mat2);


            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++){

                    System.out.print(result[i][j]+" ");
                }
                System.out.println("");
            }



    } //setMatrix Ends here

    public int[][] addedMatrix(int r,int c,int[][] mat1,int[][] mat2){
        int[][] ans = new int[r][c];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                ans[i][j] = mat1[i][j]+mat2[i][j];
            }

 return ans;


    }










}
