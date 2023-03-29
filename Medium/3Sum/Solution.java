import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    
    for(int i = 0; i < n - 2; i++) {
        if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int l = i + 1, r = n - 1;
            
            while(l < r) {
                if(nums[l] + nums[r] == -1*nums[i]) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
                else if(nums[l] + nums[r] < -1*nums[i]) l++;
                else r--;
            }
        }
    }
    
    return list;
}
}