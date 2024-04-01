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
