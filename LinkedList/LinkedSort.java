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

class LinkedSort
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
		   
		      head = new LinkedList().mergeSort(head);
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
    static Node mergeSort(Node head)
    {
        
        if(head==null||head.next==null){
            return head;
        }
        Node mid=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            mid=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        mid.next=null;
        
        Node left=mergeSort(head);
        Node right=mergeSort(slow);
        
        return merge(left,right);
    }
    
    static Node merge(Node left, Node right){
        
        if (left == null)
            return right;
        if (right == null)
            return left;
        Node temp = new Node(0);
        Node finalList = temp;
        while(left!=null&&right!=null){
            if(left.data<right.data){
                finalList.next = new Node(left.data);
                left=left.next;
            }else{
                finalList.next = new Node(right.data);
                right=right.next;
            }
            finalList=finalList.next;
        }
        while(left!=null){
            finalList.next = new Node(left.data);
            finalList=finalList.next;
            left=left.next;
        }
        while(right!=null){
            finalList.next = new Node(right.data);
            finalList=finalList.next;
            right=right.next;
        }
        
        return temp.next;
    }
}
