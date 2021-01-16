class MedianSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length+nums2.length;
        int n = l/2;
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr3[] = new int[l];
        
        while (i<n1 && j <n2) 
        {  
            if (nums1[i] < nums2[j]) 
                arr3[k++] = nums1[i++]; 
            else
                arr3[k++] = nums2[j++]; 
        }
        while (i < n1) 
            arr3[k++] = nums1[i++]; 
   
        while (j < n2) 
            arr3[k++] = nums2[j++]; 
        
        if(n1==0){
            if(n2%2==0){
                return (double)(nums2[(n2/2)-1]+nums2[n2/2])/2;
            }else{
                return nums2[n2/2];
            }
        }else if(n2==0){
            if(n1%2==0){
                return (double)(nums1[(n1/2)-1]+nums1[n1/2])/2;
            }else{
                return nums1[n1/2];
            }
        }
        if(l%2==0){
            return (double)(arr3[n-1]+arr3[n])/2;
        }else{
            return (arr3[n]);
        }
    }
}
