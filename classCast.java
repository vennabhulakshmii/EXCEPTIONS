import java.util.Scanner;
import java.util.*;
 class Mains
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	//	Object obj=new Integer(10);
	   Object obj=new String("hello");

	
	try{
	    String str=(String)obj;
	    System.out.print(str);
	}
	catch(ClassCastException e){
	    System.out.print("exceptio rasied");
	}
	}
}