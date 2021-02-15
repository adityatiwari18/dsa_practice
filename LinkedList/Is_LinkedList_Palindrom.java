import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
   
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Palindrome g = new Palindrome();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}
class Palindrome
{
    boolean isPalindrome(Node head) 
    {
        if(head==null||head.next==null)
            return true;
        Node slow=head, fast=head,prev=head;
        Node cur=head;
        int c=0;
        while(cur!=null){
            ++c;
            cur=cur.next;
        }
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        cur=head;
        if(c%2!=0){
            prev.next=null;
            slow=slow.next;
        }
        Node pre=null;
        while(slow!=null){
            Node nex = slow.next;
            slow.next = pre;
            pre = slow;
            slow = nex;
        }
        while(pre!=null){
            if(cur.data!=pre.data){
                return false;
            }
            pre=pre.next;
            cur=cur.next;
        }
        return true;
    }    
}
