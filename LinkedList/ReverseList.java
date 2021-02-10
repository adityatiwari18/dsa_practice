import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class ReverseList{

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
        
            ReverseLL g = new ReverseLL();
            head = g.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
class ReverseLL
{
    Node reverseList(Node head)
    {
        Node prev=null;
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
