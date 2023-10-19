class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,end=nums.length-1;
        if(nums.length==1)
            return 0;

        while(start<=end){
            int mid=(start+end)/2;
            
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                {
                    return mid;
                }
                else if(nums[mid]<nums[mid-1])
                {
                    end=mid-1;
                }
                else if(nums[mid]<nums[mid+1])
                {
                    start=mid+1;
                }
            }
            else if(mid==0)
            {
                if(nums[0]>nums[1])
                    return 0;
                else
                    return 1;
            }
            else if (mid == end)
            {
                if(nums[nums.length-1]>nums[nums.length-2])
                    return nums.length-1;
                else
                    return nums.length-2;
            }
        }
        return -1;
    }
}
