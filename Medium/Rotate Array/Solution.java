class Solution {
    public void rotate(int[] nums, int k) {
    
    k = k % nums.length;
    //p1
    reverse(nums,0 , nums.length-k-1);

    //p2
     reverse(nums, nums.length-k ,nums.length-1);
    //p1 + p2
      reverse(nums, 0 ,nums.length-1);

    }  

    public void reverse(int[] nums, int i , int j ) {
           int lf = i ; 
           int rI = j ;
           while(lf < rI){
               int temp = nums[lf];
               nums[lf] = nums[rI];
               nums[rI] = temp;
               lf++;
               rI--;
           }
    }
    

}