// https://www.codechef.com/problems/P1169

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String out = "";
        
        if (x <= 9) out = "NO";
        else out = "YES";
        
        System.out.println(out);
	}
}
