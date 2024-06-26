class Solution {

  public int[] sort(int[] arr) {
    // all elements < low are 0 and all elements > high are 2
    // all elements from >= low < i are 1
    int low = 0, high = arr.length - 1;
    for (int i = 0; i <= high;) {
      if (arr[i] == 0) {
        swap(arr, i, low);
        // increment 'i' and 'low'
        i++;
        low++;
      } else if (arr[i] == 1) {
        i++;
      } else { // the case for arr[i] == 2
        swap(arr, i, high);
        // decrement 'high' pointer only
        //  after the swap the number at index 'i' could be 0, 1, or 2
        high--;
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = new int[] { 1, 0, 2, 1, 0 };
    arr = sol.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();

    arr = new int[] { 2, 2, 0, 1, 2, 0 };
    arr = sol.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
  }
}

//We start by initializing three variables: low to 0, high to the last index of the array, and i also to 0. 
//Low is meant to keep track of the latest position where a 0 should be placed, high is meant to keep track 
//of the latest position where a 2 should be placed, and i is used to iterate through the array.



// Algorithm ensures:
// - All elements before low are 0s (elements<low )
// - Elements between low and i are 1s  (elements>=low and elements<=high are 1)
// - All elements after high are 2s(elements>high )
