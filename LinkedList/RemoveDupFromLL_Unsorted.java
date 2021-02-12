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

class RemoveDupFromLL_Unsorted
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
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
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}	
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}

class GfG
{
    public Node removeDuplicates(Node head) {
         Node temp=head;
         if(head==null||head.next==null)
            return head;
         HashSet<Integer> hs= new HashSet<>();
         hs.add(temp.data);
         while(temp.next!=null){
             if(hs.contains(temp.next.data)){
                 temp.next=temp.next.next;
             }else{
                 hs.add(temp.next.data);
                 temp=temp.next;
             }
         }
         return head;
    }
}
