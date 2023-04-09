class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
          int element = nums[i];
          if(element > 0 && element <= n ){
            int chair = element - 1;
          if(nums[chair] != element){
             swap(nums , chair , i);
             i--;
          }
          }
        }

        for(int i=0 ; i<n ; i++){
            if( (i+1) != nums[i]){
                return i+1;
            }
        }

        return n+1;
        
    }

    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
     }
}
