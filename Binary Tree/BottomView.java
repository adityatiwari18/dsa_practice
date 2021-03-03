import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}



class BottomView {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Tree g = new Tree();
			    ArrayList <Integer> res = g.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}
class Tree
{
 
    static class Pair{
        int d;
        int l;
        Pair(int dd, int ll){
            d=dd;
            l=ll;
        }
        
        int getdata(){
            return d;
        }
        
        int getlevel(){
            return l;
        }
    }
    // Method that returns the bottom view.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        TreeMap<Integer, Pair> tm = new TreeMap<>();
        tm.put(0, new Pair(root.data, 0));
        bottomView(root, tm, 0, 0);
        
        for(Map.Entry<Integer,Pair> m : tm.entrySet()){
            arr.add(m.getValue().getdata());
        }
        return arr;
    }
    
    public static void bottomView(Node root, TreeMap<Integer, Pair> tm, int c, int level){
        if(root==null)
            return;
        else{
            if(!tm.containsKey(c)){
                tm.put(c, new Pair(root.data, level));
            }else{
                if(tm.get(c).getlevel()<level){
                    tm.put(c, new Pair(root.data, level));
                }
            }
            bottomView(root.right, tm, c+1, level+1);
            bottomView(root.left, tm, c-1, level+1);
            
        }
    }
}
