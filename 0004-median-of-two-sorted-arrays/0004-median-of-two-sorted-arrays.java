import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n= nums2.length;
     int m =nums1.length;
     int k=m+n;
     double[] s =new double[m+n];
     for(int i=0;i<n;i++){
        s[i]=nums2[i];
     }   
    for(int i=0;i<m;i++){
        s[n+i]=nums1[i];
    }
    Arrays.sort(s);
     double p=0;
    if(k%2==0){
         p=(s[k/2-1]+s[k/2])/2;
    }
    else{
        p=s[(k+1)/2-1];
    }
    return p;
    }
}