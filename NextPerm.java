import java.io.*;
class NextPerm {

    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[n];
		String inputLine[] = br.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
	        arr[i] = Integer.parseInt(inputLine[i]);
	    }
	   NextPerm obj = new NextPerm();
	   obj.nextPermutation(arr);
    }
    void nextPermutation(int[] nums) {
        
        int pos=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                pos=i;
                break;
            }
        }
        if(pos==-1){
            int p1=0;
            int p2=nums.length-1;
            while(p1<p2){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }
        }else{
            for(int i=nums.length-1;i>=pos;i--){
                if(nums[i]>nums[pos-1]){
                    int temp = nums[pos-1];
                    nums[pos-1] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            int end = nums.length-1;
            while(pos<=end){
                int temp = nums[pos];
                nums[pos] = nums[end];
                nums[end] = temp;
                pos++;
                end--;
            }
        }
        for(int i=0; i<nums.length; i++){
		    System.out.print(nums[i]+" ");
		}
        System.out.println();
    }
}
