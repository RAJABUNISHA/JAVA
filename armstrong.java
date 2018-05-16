
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
		String s = sc.nextLine();
		try{
			int n = Integer.parseInt(s);
			int temp=n;
			int c=0;
			while(n!=0){
				int a = n%10;
				n=n/10;
				c=c+(a*a*a);
				
			}
			if(temp==c)
			System.out.println("yes");
			else
			System.out.println("no");
			
		}
	         catch(NumberFormatException nef){
			System.out.println("invalid input");
		}
	}
}
