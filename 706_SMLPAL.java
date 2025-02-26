//https://www.codechef.com/problems/SMLPAL

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 0; a<t; a++){
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		
    		String out = "";
            for (int i = 0; i<x/2; i++){
                out += "1";
            }
            for (int j = 0; j<y; j++){
                out += "2";
            }
            for (int i = 0; i<x/2; i++){
                out += "1";
            }
    		System.out.println(out);
        }
	}
}
