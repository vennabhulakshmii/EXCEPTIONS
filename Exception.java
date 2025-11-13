
import java.util.Scanner;
import java.util.*;
 class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int arr[]={1,2,3,4};
		String s="hello";
		try{
		    System.out.print(a/b);
            //String s=null;
		   // System.out.print(s.length());
		    int c=sc.nextInt();
		    System.out.print(c);
		    System.out.print(arr[1]);
		    System.out.print(s.charAt(3));
		    int num=Integer.parseInt(s);
		    System.out.print(num);
		}
		catch(ArithmeticException e){
		    System.out.print("exception occured");
		}
		catch(NullPointerException e){
		    System.out.print("exception occured");
		}
		catch(InputMismatchException e) {
		    System.out.print("exception raised");
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.print("exception raise");
		}
		catch(StringIndexOutOfBoundsException e){
		    System.out.print("string index out of range");
		}
		catch(NumberFormatException e){
		    System.out.print("number format exception");
		    
		}
	}
}
