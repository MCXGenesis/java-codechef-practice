import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        String line;
        String lineSplit[];
        for (int i = 0; i<t; i++){
            int happy = 0;
            int max =0;
            int min =0;
            int n = read.nextInt();
            int l = read.nextInt();
            int r = read.nextInt();
            int arr [] = new int [n];
            for(int j = 0; j<arr.length; j++){
                arr[j]=read.nextInt();
            }
            for(int k = 0; k<arr.length; k++){
                if(arr[k] >= l && arr[k] <= r ){
                    happy++;
                }
                else{
                    happy--;
                    
                }
                if(min>happy){
                    min = happy;
                    }
                if(max<happy){
                    max = happy;
                    }
            }
        System.out.print(max + " ");
        System.out.print(min);
        System.out.println();
        }
	}
}
