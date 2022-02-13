class Solution
{
  static void insert(int arr[],int i)
  {
        for(int j=i;j>=0;j--)
       {
           if(arr[j+1]<arr[j])
           {
             int temp=arr[j+1];
             arr[j+1]=arr[j];
             arr[j]=temp;  
           }
           
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      int i=0;
      for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                insert(arr,i);
            }
            i+=1;
        }
  }
}
