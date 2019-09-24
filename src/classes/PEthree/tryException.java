package classes.PEthree;

public class tryException {

public void CheckException(){

    System.out.println("/n");

  try {
      throw new myException("This is my Exception");
  }
  catch(Exception e)
  {
      System.out.println(e);
  }
  finally {
      System.out.println("I was here ! :)");
  }

}

}


class myException extends Exception{

 public myException(String str){
     super(str);
 }


}
