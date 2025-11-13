import java.util.Scanner;
import java.util.*;
 class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Main m=new Main();
		m.m1(sc.nextInt(),sc.nextInt());
	
	}
	void m1(int a,int b){
	    try{
	        System.out.print(a/b);
	        try{
	            String s="Hello";
	            System.out.print(s.length());
	        }
	        catch(NullPointerException e){
	            System.out.print("exception raised");
	        }
	    }
	    catch(ArithmeticException e){
	        try{
	            int c=sc.nextInt();
	            System.out.print(c);
	        }
	        catch(InputMismatchException ae){
	            System.out.println("Inputmismatch occured");
	        }
	    }
	    finally{
	        try{
	            String s="12";
	            int num=Integer.parseInt(s);
	            System.out.print(num);
	        }
	        catch(NumberFormatException e){
	            System.out.print("Inputmismatch");
	        }
	    }
	}
}