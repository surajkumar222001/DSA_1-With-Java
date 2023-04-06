/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let area = 0;
    let higherPointer = height.length-1;
    let lowerPointer = 0;
    while(lowerPointer < higherPointer){
      let bredth = (higherPointer - lowerPointer);
       let length = Math.min(height[lowerPointer],height[higherPointer]);
      area = Math.max(area , bredth*length);
      (height[higherPointer] > height[lowerPointer]) ?
      lowerPointer++ : higherPointer-- ;
    }
    return area;
};