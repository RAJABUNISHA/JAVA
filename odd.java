
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	     String s1 = sc.nextLine();
	     String s2 = sc.nextLine();
	     try{
		     if(n<=100000 && q<=100000)
	     	int n = Integer.parseInt(s1);
	            int q = Integer.parseInt(s2);
	     	for(int i=n;i<q;i++){
	     	 if(i%2!=0)
	     	    System.out.println(+i);
	     	}
	     	}
	     catch(NumberFormatException nef){
	     	System.out.println("invalid input");
	     }
	}
}
