import java.util.*;

class Solution {

  public List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    Arrays.sort(arr);
    List<List<Integer>> quadruplets = new ArrayList<>();
    for (int i = 0; i < arr.length - 3; i++) {
      // skip same element to avoid duplicate quadruplets
      if (i > 0 && arr[i] == arr[i - 1]) 
        continue;
      for (int j = i + 1; j < arr.length - 2; j++) {
        // skip same element to avoid duplicate quadruplets
        if (j > i + 1 && arr[j] == arr[j - 1]) 
          continue;
        searchPairs(arr, target, i, j, quadruplets);
      }
    }
    return quadruplets;
  }

  private static void searchPairs(int[] arr, int targetSum, int first, 
                                  int second, List<List<Integer>> quadruplets) {
    int left = second + 1;
    int right = arr.length - 1;
    while (left < right) {
      int sum = arr[first] + arr[second] + arr[left] + arr[right];
      if (sum == targetSum) { // found the quadruplet
        quadruplets.add(Arrays.asList(arr[first], arr[second], arr[left], arr[right]));
        left++;
        right--;
        while (left < right && arr[left] == arr[left - 1])
          left++; // skip same element to avoid duplicate quadruplets
        while (left < right && arr[right] == arr[right + 1])
          right--; // skip same element to avoid duplicate quadruplets
      } else if (sum < targetSum)
        left++; // we need a pair with a bigger sum
      else
        right--; // we need a pair with a smaller sum
    }
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(
        sol.searchQuadruplets(new int[] { 4, 1, 2, -1, 1, -3 }, 1));
    System.out.println(
        sol.searchQuadruplets(new int[] { 2, 0, -1, 1, -2, 2 }, 2));
  }
}


// Algorithm:
// 1. Sort the input array in ascending order.
// 2. Loop through the array, fixing the first number of the quadruplet.
// 3. For each first number, loop through the array again, fixing the second number.
// 4. For each pair of first and second numbers, use the Two Pointers approach to find pairs of numbers that sum to (target - first - second).
//    - Initialize two pointers, left and right.
//    - Calculate sum of current four numbers.
//    - If sum equals target, add quadruplet to result list, move pointers inward, skipping duplicates.
//    - If sum < target, move left pointer to right to increase sum.
//    - If sum > target, move right pointer to left to decrease sum.
// 5. Return list of quadruplets found.
