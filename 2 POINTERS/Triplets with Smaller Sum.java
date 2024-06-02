import java.util.*;

class Solution {

  public int searchTriplets(int[] arr, int target) {
    if (arr.length < 3) {
      return 0;
    }
    
    Arrays.sort(arr);
    int count = 0;
    for (int i = 0; i < arr.length - 2; i++) {
      count += searchPair(arr, target - arr[i], i);
    }
    return count;
  }

  private static int searchPair(int[] arr, int targetSum, int first) {
    int count = 0;
    int left = first + 1, right = arr.length - 1;
    while (left < right) {
      if (arr[left] + arr[right] < targetSum) { // found the triplet
        
        count += right - left; // becos in ascending order so all in between will also form valid pairs
        left++; 
      } else {
        right--; // we need a pair with a smaller sum
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(
        sol.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
    System.out.println(
        sol.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
  }
}





// The problem "Triplets with Smaller Sum" asks to find the count of triplets in an
// array whose sum is less than a given target value. The solution follows the Two
// Pointers approach. The main steps of the algorithm are:
// 
// Sort the array in ascending order.
// Iterate through the array, taking one number at a time.
// For each number, find pairs in the remaining array whose sum with the current number is less
// than the target. To find the pairs, use two pointers (left and right) and move them based on
// the sum.
// 
// If the sum is less than the target, all elements between left and right form valid triplets.
// so keeping the "first" and "left" pointers fixed we get (right-left) number of pointers on the right or another way of saying this: say we get (right-left) number of pointers with "first" and "left" pointers fixed
// Increment the count and move the left pointer.

//If the sum is greater than or equal to the target,
// move the right pointer to decrease the sum.
// 
// Repeat steps 3-4 for all numbers in the array. Return the total count of triplets.
