import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class AddtwoLL{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
class Solution{
    static Node addTwoLists(Node first, Node second){
        int c1=0,c2=0;
        Node p1=null,p2=null;
        Node cur1=first,cur2=second;
        while(cur1!=null){
            Node nex1=cur1.next;
            cur1.next=p1;
            p1=cur1;
            cur1=nex1;
            ++c1;
        }
        while(cur2!=null){
            Node nex2=cur2.next;
            cur2.next=p2;
            p2=cur2;
            cur2=nex2;
            ++c2;
        }
        if(c1>c2){
            return add(p1,p2);
        }else
            return add(p2,p1);
    }
    
    static Node add(Node p1, Node p2){
        int carry=0;
        Node cur1=p1;
        while(p1!=null){
            int temp = p1.data;
            if(p2!=null)
                temp=temp+p2.data;
            if((temp+carry)>9){
                p1.data=(temp+carry)%10;
                carry=(temp+carry)/10;
            }else if((temp+carry)<=9){
                p1.data=(temp+carry);
                carry=0;
            }
            p1=p1.next;
            if(p2!=null)
                p2=p2.next;
        }
        p1=null;
        while(cur1!=null){
            Node nex1=cur1.next;
            cur1.next=p1;
            p1=cur1;
            cur1=nex1;
        }
        if(carry!=0){
            Node n = new Node(carry);
            n.next = p1;
            p1=n;
        }
        return p1;
    }
}
