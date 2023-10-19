//https://www.youtube.com/watch?v=FPCZsG_AkUg

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] result=new int[nums.length];
        int counter=0;
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right])) {
                result[nums.length - counter - 1] = nums[left] * nums[left];
                left++;
            }
            else {
                result[nums.length - counter - 1] = nums[right] * nums[right];
                right--;
            }

            counter++;
        }

        return result;
    }
    
}
