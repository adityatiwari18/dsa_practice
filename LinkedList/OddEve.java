import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class OddEve{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans); 
            t--;
        }
    } 
}

class Solution{
    Node divide(int N, Node head){
        Node nlist=new Node(0);
        Node res=nlist;
        Node n=head;
        Node n1=head;
        while(n!=null){
            if(n.data%2==0){
                nlist.next = new Node(n.data);
                nlist=nlist.next;
            }
            n=n.next;
        }
        while(n1!=null){
            if(n1.data%2!=0){
                nlist.next = new Node(n1.data);
                nlist=nlist.next;
            }
            n1=n1.next;
        }
        
        return res.next;
    }
}
