//  https://www.codechef.com/problems/GLPR

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
        int y = sc.nextInt();
        
        if (x*2>=y) System.out.println("METAL");
        else System.out.println("PLASTIC");
	}
}
