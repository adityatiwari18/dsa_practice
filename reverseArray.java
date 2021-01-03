import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            int n = Integer.parseInt(read.readLine());
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(read.readLine());
            }
            reverseArray(arr);
            display(arr);
            
        }
    }
    
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static void reverseArray(int[] arr){
        int length = arr.length;
        int i=0;
        
        while(i<=length-1){
            int temp = arr[i];
            arr[i] = arr[length-1];
            arr[length-1] = temp;
            i++;
            length--;
        }
    }
}
