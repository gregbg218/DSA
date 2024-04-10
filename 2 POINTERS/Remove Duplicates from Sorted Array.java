//https://www.youtube.com/watch?v=DEJAZBq0FDA

class Solution {
    public int removeDuplicates(int[] nums) {
        int left =1,right=1;
        while(right<nums.length)
        {
            if(nums[right]!=nums[left-1])       // note left-1
            
            {
                
                nums[left]=nums[right];
                left++;
                
            }
            right++;
            
        }
        return left;
    }
        
    
}


//when left and right are same they exchange which is same as nothing
// we start from 1 as left-1 should exist

//Initialize two pointers, left and right, both starting at index 1 of the array nums. The left pointer represents the position where the next unique 
//element should be placed, and the right pointer is used to iterate through the array.
//Enter a while loop that continues as long as right is less than the length of the array.
//Inside the loop, compare the element at index right with the element at index left - 1:
//If the elements are different, it means we have found a new unique element. In this case, we copy the element at index right to index left 
//and increment the left pointer.
//If the elements are the same, it means we have encountered a duplicate element, so we do not copy it and simply move on.
