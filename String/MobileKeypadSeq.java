import java.util.*;
import java.lang.*;
import java.io.*;
class MobileKeypadSeq
 {
	public static void main (String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    sc.useDelimiter("\n");
	    HashMap<Character, String> hs = new HashMap<>();
	    hs.put('A', "2");
	    hs.put('B', "22");
      hs.put('C', "222");
      hs.put('D', "3");
      hs.put('E', "33");
      hs.put('F', "333");
      hs.put('G', "4");
      hs.put('H', "44");
      hs.put('I', "444");
      hs.put('J', "5");
      hs.put('K', "55");
      hs.put('L', "555");
      hs.put('M', "6");
      hs.put('N', "66");
      hs.put('O', "666");
      hs.put('P', "7");
	    hs.put('Q', "77");
      hs.put('R', "777");
      hs.put('S', "7777");
      hs.put('T', "8");
      hs.put('U', "88");
      hs.put('V', "888");
      hs.put('W', "9");
      hs.put('X', "99");
      hs.put('Y', "999");
      hs.put('Z', "9999");
      hs.put(' ',"0");
	    if(sc.hasNext()){
	        int t = sc.nextInt();
	        while(t-->0){
	            String s = sc.next();
	            for(int i=0;i<s.length();i++){
	                char ch = s.charAt(i);
	                 
	                if(ch==' ')
	                    System.out.print("0");
	                else
	                    System.out.print(hs.get(ch));
	            }
	            System.out.println();
	        }
	    }
	}
}
