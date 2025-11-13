class InvalidCheckException extends Exception{
    InvalidCheckException(String message){
        super(message);
    }
}
class Main{
    static void checkAge(int age) throws InvalidCheckException{
   
			if(age<18){
			    throw new InvalidCheckException("he is not eligible vote");
			}
			else{
			    System.out.print("he is eligible");
			}
		
    }
	public static void main(String[] args){
		try{
		    checkAge(18);
		}
		
		catch(InvalidCheckException e){
		    System.out.print("exception occured : "+e.getMessage());
		}
}
}