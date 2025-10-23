class Main5{
    public static void main(String[] args){
        if(age<18){
            throw new ArithmeticException("Not Eligible to cast vote");
        }else{
            System.out.println("You can cast your vote");
        }
    }
}