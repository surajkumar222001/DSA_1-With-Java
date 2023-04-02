//Algorithm - Binary Search

class Solution {
    public int search(int[] nums, int target) {
      int left = 0;
      int right =nums.length -1;
     
      while(left <= right){
         int mid = (left + right)/2;
          if(target == nums[mid]) return mid;
          // check mid is in left sorted or right sorted
          if(nums[left] <= nums[mid]){
              //left sorted 
              if(nums[left] <= target &&  target <= nums[mid]){
                  right = mid - 1;
              }else{
                  left = mid + 1;
              }
          }else
              //right sorted
              if(nums[mid] <= target  && target <= nums[right]){
                  left = mid + 1;
              }else{
                  right = mid - 1;
              }      
      }
      return -1;
    }
}
