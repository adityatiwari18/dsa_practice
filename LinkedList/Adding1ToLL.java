import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class Adding1ToLL
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Sol obj = new Sol();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
class Sol
{
    public static Node addOne(Node head) 
    { 
        Node cur=head;
        Node pre=null;
        while(cur!=null){
            Node nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        cur=pre;
        int carry=0;
        
        //reversing the List
        if(pre!=null){
            if(pre.data+1+carry>9){
                int temp=pre.data;
                pre.data=(temp+1+carry)%10;
                carry=(temp+1+carry)/10;
            }else if(pre.data+1+carry<=9){
                pre.data=pre.data+1+carry;
                carry=0;
            }
        }
        pre=pre.next;
        
        //Adding 1 to it
        while(pre!=null){
            if(pre.data+carry>9){
                int temp=pre.data;
                pre.data=(temp+carry)%10;
                carry=(temp+carry)/10;
            }else if(pre.data+carry<=9){
                pre.data=pre.data+carry;
                carry=0;
            }
            pre=pre.next;
        }
        pre=null;
        
        //reversing again
        while(cur!=null){
            Node nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        //checking if leftmost element had carry
        if(carry!=0){
            pre.data=(carry*10)+pre.data;
        }
        return pre;
    }
}
