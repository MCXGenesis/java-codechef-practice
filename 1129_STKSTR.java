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
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int [] arr = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int index = -1;
            int count = 1;
            for (int i = 1; i<n; i++){
                if (arr[i]<arr[i-1]){
                    index = i;
                }
                else count++;
            }
            
            if (arr[index]*x<arr[index-1]){
                System.out.println(count);
            }
            else{
                arr[index] = arr[index] * x;
                count++;
                System.out.println(count);
            }
        }
	}
}
