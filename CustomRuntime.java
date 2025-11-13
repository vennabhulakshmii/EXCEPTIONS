class NegativeAmountException extends RuntimeException{
    NegativeAmountException(String message){
        super(message);
    }
}
class Maine 
{
    static void withdraw(int amount,int balance){
        if(amount<balance){
            throw new NegativeAmountException("insuffient balance");
        }
        else{
            System.out.print("yeah! you have balance");
        }
    }
	public static void main(String[] args) {
		withdraw(100,200);
	}
}