class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int n=s.length();
        int maxi=0;
        int curr=0;
        int maxlen=0;
       int i=0;
    int j=0;
        while (j<n){
            char c=s.charAt(j);
            arr[c-'A']++;
            maxi=Math.max(maxi,arr[c-'A']);
            if((j-i+1)-maxi>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
       
return maxlen;
        }
    }
