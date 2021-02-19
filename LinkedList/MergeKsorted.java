import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class MergeKsorted
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            Merge g = new Merge();
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
class Merge
{
    Node mergeKList(Node[]a,int N){       
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Node list = new Node(0);
        Node head=list;
        for(int i=0;i<N;i++){
            while(a[i]!=null){
                pq.add(a[i].data);
                a[i]=a[i].next;
            }
        }
        while(pq.size()>0){
            list.next=new Node(pq.poll());
            list=list.next;
        }
        return head.next;
    }
}
