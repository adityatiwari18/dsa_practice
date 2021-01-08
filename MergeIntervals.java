import java.util.*;
class MergeIntervals {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j] = sc.nextInt();
            }
        }
        MergeIntervals ob = new MergeIntervals();
        int arr[][] = ob.merge(intervals);
        
        System.out.println("Updated Intervals");
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        boolean flag[] = new boolean[intervals.length];
        for(int i=0;i<flag.length;i++){
            flag[i]=true;
        }
        int c=0;
        Arrays.sort(intervals, (a1,a2) -> Integer.compare(a1[0],a2[0]));
        for(int i=0;i<intervals.length-1;i++){
            if(flag[i]==true){
                for(int j=i+1;j<intervals.length&&flag[j]==true;j++){
                    if(intervals[i][1]>=intervals[j][0]){
                        if(intervals[i][1]<intervals[j][1]){
                            intervals[i][1] = intervals[j][1];
                        }
                        flag[j] = false;
                        ++c;
                    }else{
                        break;
                    }
                }
            }
        }
        
        int newInt[][] = new int[intervals.length-c][2];
        int c1=0;
        for(int i=0;i<intervals.length;i++){
            if(flag[i]==true){
                newInt[c1][0] = intervals[i][0];
                newInt[c1][1] = intervals[i][1];
                c1++;
            }
        }
        return newInt;
    }
}
