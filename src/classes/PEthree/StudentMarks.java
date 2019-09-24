package classes.PEthree;

import java.util.Scanner;

public class StudentMarks {

    private double ans;

    public void studentGrade(){

        int numOfStudents;
        Scanner sc = new Scanner(System.in);
        numOfStudents=sc.nextInt();

        int[] stuGrades = new int[numOfStudents];
        int sum=0;
        for(int i=0;i<numOfStudents;i++)
        {


            try {
                stuGrades[i]=sc.nextInt();
                if (stuGrades[i] > 100 || stuGrades[i] < 0) {
                    i = i - 1;
                    throw new Exception("please enter grade between 0 to 100 : ");
                }

            }
            catch (Exception e){
                System.err.println(e);
                continue;
            }
            sum = sum +stuGrades[i];

        }


this.ans=sum/numOfStudents;

    }


    public Double getGrades(){
        return ans;
    }




}
