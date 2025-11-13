import java.util.Scanner;
class Mainn{
	public static void main(String[] args){
		int age=17;
		try{
			if(age<18){
			    throw new ArithmeticException("he is not eligible vote");
			}
			else{
			    System.out.print("he is eligible");
			}
		}
		catch(ArithmeticException e){
		    System.out.print("exception occured : "+e.getMessage());
		}
}
}


