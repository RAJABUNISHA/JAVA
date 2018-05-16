import java.lang.Math;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		try
		{
			int N = Integer.parseInt(s1);
			int K = Integer.parseInt(s2);
			
			 int result =(int) Math.pow(N, K);
			 System.out.println(+result);
		}
		catch(NumberFormatException nef)
		{
			System.out.println("invalid input");
		}
	}
}
