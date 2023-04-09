/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    // time limit exceeded with this logic
    //  for(let i=0 ; i <= nums.length ; i++){
    //      if(!nums.includes(i+1)){  
    //        return (i+1);
    //      }
    //  }
  
         let n = nums.length;
          
          for(let i = 0 ; i < n ; i++){
            let element = nums[i];
            if(element > 0 && element <= n ){
              let chair = element - 1;
            if(nums[chair] != element){
               swap(nums , chair , i);
               i--;
            }
            }
          }
  
          for(let i=0 ; i<n ; i++){
              if( (i+1) != nums[i]){
                  return i+1;
              }
          }
  
          return n+1;
          
      }
      
  
  
  let swap = ( arr,  i,  j) => {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
       }



// optimal solution
       