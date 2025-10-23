import java.util.Scanner;
class MyException extends Exception{
    class Main6{
        public static void main(String[] args){
            int[] ar1=null;
            try{
                System.out.println(ar1[0]);
            }catch(NullPointerException e){
                System.out.println("Your array is empty");
            }
        }
    }
}