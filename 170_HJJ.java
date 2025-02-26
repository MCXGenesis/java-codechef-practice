// https://www.codechef.com/problems/HJJ

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
        
        //You can BRUTE FORCE the program with this
        //int x = x + 10*2;
        
        //but it will be better if we use looping
        for (int i = 1; i < 3; i++){
            x+=10;
        }
        System.out.println(x);
	}
}
