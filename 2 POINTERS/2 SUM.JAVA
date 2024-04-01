// https://www.youtube.com/watch?v=cQ1Oz4ckceM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum>target)
            {
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
            
            else
            {

                return new int[] { left + 1, right + 1 };
            }
        }
         return new int[] {};
        
    }
}


/*
We can follow the Two Pointers approach. We will start with one pointer pointing to the 
beginning of the array and another pointing at the end. At every step, we will see if 
the numbers pointed by the two pointers add up to the target sum. 
If they do, we have found our pair; otherwise, we will do one of two things:

1)If the sum of the two numbers pointed by the two pointers is greater than the 
target sum, this means that we need a pair with a smaller sum. So, to try more pairs, 
we can decrement the end-pointer.
2)If the sum of the two numbers pointed by the two pointers is smaller than 
the target sum, this means that we need a pair with a larger sum. So, to 
try more pairs, we can increment the start-pointer.

*/
