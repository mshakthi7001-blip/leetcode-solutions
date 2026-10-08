class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int  n=nums1.length+nums2.length;
        int[] arr=new int[n];
        int n1=0,n2=0;
        for(int i=0;i<n;i++){
             if(n1 < nums1.length &&
                (n2 >= nums2.length || nums1[n1] < nums2[n2])){
                arr[i]=nums1[n1];
                n1++;
            }
            else{
                arr[i]=nums2[n2];
                n2++;
            }
        }
        if(n%2==0){
        
      return (arr[n/2-1]+arr[n/2])/2.0;
           
        }
        return arr[n/2];
    }
}