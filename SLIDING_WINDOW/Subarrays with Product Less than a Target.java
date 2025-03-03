import java.util.*;

class Solution {
  public List<List<Integer>> findSubarrays(int[] arr, int target) {
    // Resultant list to store all valid subarrays.
    List<List<Integer>> result = new ArrayList<>();

    // Variable to store the product of elements in the current subarray.
    double product = 1;

    // Left boundary of the current subarray.
    int left = 0;

    // Iterate over the array using 'right' as the right boundary of the current
    // subarray.
    for (int right = 0; right < arr.length; right++) {
      // Update the product with the current element.
      product *= arr[right];

      // If the product is greater than or equal to the target, slide the left
      // boundary to the right until product is less than target.
      while (product >= target && left < arr.length) {
        product /= arr[left++];
      }

      // Create a temporary list to store the current subarray.
      List<Integer> tempList = new LinkedList<>();

      // Iterate from 'right' to 'left' and add all these subarrays to the result.
      for (int i = right; i >= left; i--) { // we start from right becos we want to add new elements individually
        // Add the current element at the beginning of the list.
        tempList.add(0, arr[i]);

        // Add the current subarray to the result.
        result.add(new ArrayList<>(tempList)); // we are adding a copy becos we want to use the list for subarrays
        //example : [3,5,6]
        // so in 1st iteration templist will have 3 and in second it will have 3,5 and then 3,5,6 
        // individually 5 and 6 have already been added in the previous iteration
      }
    }

    // Return the result.
    return result;
  }

  // Main method for testing.
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
    System.out.println(sol.findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
  }
}
// Example:
// Array: [2, 5, 3, 10]
// Target: 30
// Array is not sorted
// Steps:
// 1. Initialize `left` and `right` pointers.
// 2. Initialize `product` = 1.
// 3. Move `right` pointer:
//    - Calculate `product`.
//    - Add valid subarrays to result.
// 4. Return result: [[2], [5], [2, 5], [3], [5, 3], [10]].


// refer this for code
//https://www.designgurus.io/course-play/grokking-the-coding-interview/doc/63ddad8dfcc4ca873d5fc5e5


//how to add all possible subarrays ending at the right pointer:

//Let's say our right pointer is at 3 in array [2, 5, 3] and our window is [5, 3] (left is at 5):

//We start from the right pointer and work backwards to left pointer:

//First add [3] (just right pointer element)
//Then add [5, 3] (include one more element to left)
