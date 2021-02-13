import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
	
 class LinkedList_Intersection
{
    Node head = null;  
	Node tail = null;

public void addToTheLast(Node node) 
{

  if (head == null) {
   head = node;
   tail = head;
  } else {
   tail.next=node;
   tail = node;
  }
}
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			LinkedList_Intersection llist1 = new LinkedList_Intersection();
		    LinkedList_Intersection llist2 = new LinkedList_Intersection();
			LinkedList_Intersection llist3 = new LinkedList_Intersection();
			
				int a1=sc.nextInt();
				Node head1= new Node(a1);
				Node tail1= head1;
				
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					tail1.next = (new Node(a));
					tail1= tail1.next;
				}
			
			
				int b1=sc.nextInt();
				Node head2 = new Node(b1);
				Node tail2 = head2;
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt();  
					tail2.next = (new Node(b));
					tail2= tail2.next;
				}
				
				int c1=sc.nextInt();
				Node head3= new Node(c1);
				tail1.next = head3;
				tail2.next = head3;
				Node tail3=head3;
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt();   
					tail3.next = (new Node(c));
					tail3= tail3.next;
				}
				
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(head1, head2));
			t--;			
         }
    }
}

class Intersect
{
	int intersectPoint(Node head1, Node head2)
	{
        if(head1==head2)
            return head1.data;
        Node temp1 = head1;    
        Node temp2 = head2;
        int c1=0,c2=0;
        while(temp1!=null){
            c1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            c2++;
            temp2=temp2.next;
        }
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            return findelement(head1, head2, diff);
        }else{
            return findelement(head2, head1, diff);
        }
	}
	int findelement(Node head1, Node head2, int diff){
	    
	    while(diff!=0){
	        head1=head1.next;
	        diff--;
	    }
	    int res=0;
	    while(head1.next!=null&&head2.next!=null){
            if(head1.next==head2.next){
                res = head1.next.data;
                break;
            }else{
                head1=head1.next;
                head2=head2.next;
            }
        }
        
        return res;
	}
}
