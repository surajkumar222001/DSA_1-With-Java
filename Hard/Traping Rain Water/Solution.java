// time complexity O(n);
// space O(1);

class Solution {
    public int trap(int[] height) {
        int n = height.length ;
        int ans = 0 ;
        // two pointers
       int left = 0 ;
       int right = n - 1;
       int leftBar = height[0];
       int rightBar = height[n-1]; 
       while(left <= right ){
           if(leftBar < rightBar){
            // when the left is greater then leftBar then there is no water store 
            // limiting leftBar will be height[left] 
             if(height[left] > leftBar){
                 leftBar = height[left];
                
             }else{
                 ans += leftBar - height[left];
                  left++;
             }
           }else{      
             if(height[right] > rightBar){
                 rightBar = height[right];        
             }else{
                 ans += rightBar - height[right];
                 right--;
             }

           }
       }
       return ans;
    }
}