import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        int[] ar1={100,200,300,400,500};
        try{
            System.out.println(ar1[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("***********************************");
            System.out.println( "Given Index Number not existed in Array");
            System.out.println("***********************************");
        }
    }
}