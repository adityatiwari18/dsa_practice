import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node start=null,end=null;
        start=end=new Node(0);
        while(head1!=null&&head2!=null){
            
            if(head1.data==head2.data){
                end.next = new Node(head1.data);
                end=end.next;
                head1=head1.next;
                head2=head2.next;
            }else if(head1.data>head2.data){
                head2=head2.next;
            }else{
                head1=head1.next;
            }
        }
        return start.next;
    }
}
