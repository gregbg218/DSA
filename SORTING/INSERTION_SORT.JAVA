class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int temp = arr[i];
       int j = i-1;
       for(;(j>=0 && arr[j]>temp); j--) //LOOK AT THE FOR LOOP
       {           
               arr[j+1] = arr[j];        
       }
        arr[j+1] = temp;  // THIS HANDLES BOTH FINDING A LESSER ELEMENT AND J IS LESS THAN 0
  }
  
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 1 ; i<arr.length ; i++)
      {
          insert(arr,i);
      }
  }
}
