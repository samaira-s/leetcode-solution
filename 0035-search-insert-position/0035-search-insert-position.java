class Solution {
    public int searchInsert(int[] arr, int key) {
        int n=arr.length;
int low=0;
    int high=n-1;
    int mid;
    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    int i=0;
    if(arr[0]>key){
        return 0;
    }
    while(i<n-1){
       
    if( arr[i]<key && arr[i+1]>key){
        break;
    }
    i++;
    }
    return (i+1);
    }}
