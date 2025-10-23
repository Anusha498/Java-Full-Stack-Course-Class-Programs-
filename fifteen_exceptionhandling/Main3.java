import java.util.Scanner;
class Main3{
    public static void main(String[] args){
       try{
       int[] ar1=new int[-5];
       ar1[0]=100;
       ar1[1]=200;
       System.out.println(ar1[0]); 
       System.out.println(ar1[2]);
       System.out.println(ar1[3]);
       }catch(NegativeArraySizeException e){
            
          System.out.println("Array Can not be created with Negative size");

       }

    }
}