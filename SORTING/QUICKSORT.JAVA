class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
        int i=low , j=high , pivot=low;
        while(i<j)
        {
            while(arr[i]<=arr[pivot] && i<high)
            {
                i+=1;
            }
            while(arr[j]>arr[pivot] && j>=0)
            {
                j-=1;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }
        }
        swap(arr,pivot,j);
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
        }
        
    }
    
}
