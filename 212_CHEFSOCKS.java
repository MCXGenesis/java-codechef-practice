// https://www.codechef.com/problems/CHEFSOCKS

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (a > x+y) System.out.println("NO");
		else System.out.println("YES");
	}
}
