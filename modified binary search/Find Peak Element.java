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


// In the last 2 else if conditions we are directly returning 1 or return nums.length-2; becos the question states
// You may imagine that nums[-1] = nums[n] = -∞. 
//In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// so element at nums[-1] < nums[0] and element at nums[nums.length]<nums[nums.length-1]
