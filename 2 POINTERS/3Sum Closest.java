//https://www.youtube.com/watch?v=wrXTw96G3G4

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=Integer.MAX_VALUE,result=0;

        if (nums.length < 3)
            return 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int temp=Math.abs(sum-target);
                if(temp<closest)
                {
                    closest=temp;
                    result=sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }

        }
        return result;
    }
}
