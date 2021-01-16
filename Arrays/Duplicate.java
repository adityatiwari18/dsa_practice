import java.util.*;
class Duplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        s.add(nums[0]);
        int s1=s.size(), res=0;
        for(int i=1;i<nums.length;i++){
            s.add(nums[i]);
            int s2=s.size();
            if(s1==s2){
                res=nums[i];
                return res;
            }
            s1=s2;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        Main s = new Main();
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println(s.findDuplicate(num));
    }
    
}
