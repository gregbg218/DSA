//https://www.youtube.com/watch?v=FPCZsG_AkUg

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] result=new int[nums.length];
        int counter=nums.length - 1;
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right])) {
                result[counter] = nums[left] * nums[left];
                left++;
            }
            else {
                result[counter] = nums[right] * nums[right];
                right--;
            }

            counter--;
        }

        return result;
    }
    
}


//two pointers starting at both ends of the input array. At any step, whichever 
//pointer gives us the bigger square, we add it to the result array and move to 
//the next/previous number.
