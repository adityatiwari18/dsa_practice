import java.util.*;

class ParenChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            String st = sc.next();
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
class Parenthesis
{
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char c = st.pop();
                    if((c=='['&&ch==']')||(c=='('&&ch==')')||(c=='{'&&ch=='}'))
                        continue;
                    else
                        return false;
                }
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}
