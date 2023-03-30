/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) {  
    let res; 
nums.sort((a,b) => a-b);
for(let i=0 ; i< nums.length ; i++){
    console.log(nums[i]);
    if(nums[i] != nums[i+1] && i === 0 ){
        res = nums[i];
        break;
    }
    else if(nums[i] != nums[i+1] && nums[i-1] != nums[i] ){
        res = nums[i];
        break;
    }
}
    return res
};