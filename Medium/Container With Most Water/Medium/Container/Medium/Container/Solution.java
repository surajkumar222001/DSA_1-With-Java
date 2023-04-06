

class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int higherPointer = height.length-1;
        int lowerPointer = 0;
        while(lowerPointer < higherPointer){
          int bredth = higherPointer - lowerPointer;
          int length = Math.min(height[lowerPointer],height[higherPointer]);
          area = Math.max(area , bredth*length);
          if(height[higherPointer] > height[lowerPointer])
          lowerPointer++ ;
          else
          higherPointer-- ;
        }
        return area;
    }
}
