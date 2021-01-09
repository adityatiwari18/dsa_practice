import java.util.*;

public class CommonEle
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            CommonEle sol = new CommonEle();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int a1=0,a2=0,a3=0,j;
        ArrayList<Integer> match = new ArrayList<>();
        while(a1!=n1||a2!=n2||a3!=n3){
            if(a1==n1-1&&a2==n2-1&&a3==n3-1){
                if(A[a1]==B[a2]&&B[a2]==C[a3]){
                    match.add(A[a1]);
                }
                break;
            }
            if(A[a1]==B[a2]&&B[a2]==C[a3]){
                match.add(A[a1]);
                j = (a1<n1-1)?++a1:a1;
                j = (a2<n2-1)?++a2:a2;
                j = (a3<n3-1)?++a3:a3;
            }
            else{
                int min = Math.min(A[a1], Math.min(B[a2], C[a3]));
                
                if(min==A[a1]){
                    j = (a1<n1-1)?++a1:(B[a2]<C[a3])?(a2<n2-1)?++a2:a2:(a3<n3-1)?++a3:a3;
                }else if(min==B[a2])
                    j = (a2<n2-1)?++a2:(A[a1]<C[a3])?(a1<n1-1)?++a1:a1:(a3<n3-1)?++a3:a3;
                else
                    j = (a3<n3-1)?++a3:(B[a2]<A[a1])?(a2<n2-1)?++a2:a2:(a1<n1-1)?++a1:a1;
            }
        }
        return match;
    }
}
