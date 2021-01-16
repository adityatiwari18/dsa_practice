import java.io.*;
import java.util.*;

class Sort012 {
    
public static void sort012(int ar[], int n)
{
    int a=0, b=0, c=0;
    
    for(int i=0;i<n;i++){
        if(ar[i]==0)
            a++;
        else if(ar[i]==1)
            b++;
        else
            c++;
    }
    int c1=0;
    while(a!=0||b!=0||c!=0){
        if(a!=0){
            ar[c1++]=0;
            a--;
        }else if(b!=0){
            ar[c1++]=1;
            b--;
        }else{
            ar[c1++]=2;
            c--;
        }
    }
}

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
