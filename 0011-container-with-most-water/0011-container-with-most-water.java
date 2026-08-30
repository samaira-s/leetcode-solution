class Solution {
    public int maxArea(int[] height) {
    int n=height.length;
    int l=0;
    int r=n-1;
    int max=0;
   while(l<r){
    int temo=0;
if(height[l]<height[r]){
temo=height[l]*(r-l);
l++;}
else{
   temo=height[r]*(r-l);
   r--; 
}
if(max<temo){
    max=temo;
}

    }
    return max;
    }
}