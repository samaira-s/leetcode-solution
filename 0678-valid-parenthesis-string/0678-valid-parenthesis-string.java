class Solution {
    public boolean checkValidString(String s) {
        int low = 0;  // Minimum possible count of open '('
        int high = 0; // Maximum possible count of open '('
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else { // c == '*'
                low--;  // If '*' acts as ')'
                high++; // If '*' acts as '('
            }
            
            if (high < 0) return false; // Too many ')'
            if (low < 0) low = 0;       // Reset min open count to 0
        }
        
        return low == 0;
    }
}