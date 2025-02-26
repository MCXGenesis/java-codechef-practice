// https://www.codechef.com/problems/SQUIDBANK

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int out = (n-k)*10000;
        System.out.print(out);
	}
}
