import java.util.Scanner;
class MyException extends Exception{
    public MyException(String msg){
        super(msg);

    }
}
class Main8{
    public static void main(String[] args){
        try{
            throw new MyException("This is user Defined Exception Message");

        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    } 
}