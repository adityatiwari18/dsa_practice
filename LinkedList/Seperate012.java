import java.util.*;
import java.io.*;

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

class Seperate012
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}

class LinkedList
{
    static Node segregate(Node head)
    {
        int c1=0,c2=0,c3=0;
        Node node=head, n2=head;
        while(node!=null){
            if(node.data==0)
                ++c1;
            else if(node.data==1)
                ++c2;
            else
                ++c3;
                
            node=node.next;
        }
        
        while(c1-->0){
            n2.data=0;
            n2=n2.next;
        }
        while(c2-->0){
            n2.data=1;
            n2=n2.next;
        }
        while(c3-->0){
            n2.data=2;
            n2=n2.next;
        }
        
        return head;
    }
}
