import java.io.*;
class MaxPro {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
              arr[i] = Integer.parseInt(inputLine[i]);
          }
         MaxPro obj = new MaxPro();
         System.out.println(obj.maxProfit(arr));
    }
    
    public int maxProfit(int[] arr) {
        int min = 2147483647;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(arr[i]-min>max){
                max = arr[i] - min;
            }
        }
        return max;
    }
}
