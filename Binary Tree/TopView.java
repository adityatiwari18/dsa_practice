import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class TopView{
    
    public static void main(String[] args)throws IOException{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
       
        while(t > 0)
           {
               Queue<Node> q = new LinkedList<>();
        
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");
            
            Node root = null;
            int j=0;
            while(n > 0){
            int a1 = Integer.parseInt(input[j]);
            int a2 = Integer.parseInt(input[j+1]);
            char lr = input[j+2].charAt(0);
            j+=3;
            
            if(root == null)
            {
                root = new Node(a1);
                q.add(root);
            }
            
            Node pick = q.peek();
            
            q.remove();
            
            if(lr=='L'){
                pick.left = new Node(a2);
                q.add(pick.left);
            }
            a1 = Integer.parseInt(input[j]);
            a2 = Integer.parseInt(input[j+1]);
            lr = input[j+2].charAt(0);
            j += 3;
            
            if(lr=='R'){
                pick.right = new Node(a2);
                q.add(pick.right);
            }
            
            n-=2;
        }
            ArrayList<Integer> res = new View().topView(root);
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}

class View
{
    static class Pair{
        int a,b;
        Pair(int aa, int bb){
            a=aa;
            b=bb;
        }
        int getdata(){
            return a;
        }
        int getlevel(){
            return b;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        
        TreeMap<Integer, Pair> hs = new TreeMap<>();
        hs.put(0, new Pair(root.data,0));
        topView(root, hs, 0, 0);
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Pair> m : hs.entrySet()){
            arr.add(m.getValue().getdata());
        }
        return arr;
    }
    static void topView(Node root, TreeMap<Integer, Pair> hs, int pos, int level){
        if(root==null)
            return;
        else{
            if(!hs.containsKey(pos))
                hs.put(pos, new Pair(root.data,level));
            else{
                if(hs.get(pos).getlevel()>level)
                    hs.put(pos, new Pair(root.data,level));
            }
            topView(root.left, hs, pos-1, level+1);
            topView(root.right, hs, pos+1, level+1);
        }
    }
}
