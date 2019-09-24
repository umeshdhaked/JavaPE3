package classes.PEthree;

public class BlackWhite {

   public void chess(){

    for(int i=0;i<8;i++)
    {
        int flag=0;
        System.out.println("");
        if(i%2==0){
            flag=1;

        }

        for (int j=0;j<8;j++){
            if(flag==1){
                if(j%2==0){
                    System.out.print("WW|");
                }
                else {
                    System.out.print("BB|");
                }

            }
            else {
                if(j%2==0){
                    System.out.print("BB|");
                }
                else {
                    System.out.print("WW|");
                }


            }

        }




    }



   }





}
