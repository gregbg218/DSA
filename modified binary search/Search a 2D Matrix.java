class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int colLength = matrix.length;
        int rowLength = matrix[0].length;
        
        int low = 0;
        int high =  colLength*rowLength-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int midRow = mid/rowLength; 
            int midCol = mid%rowLength;

            if(matrix[midRow][midCol]==target)
                return true;
            else if(matrix[midRow][midCol]>target)
                high=mid-1;
            else if(matrix[midRow][midCol]<target)
                low=mid+1;
        }
        return false;
        
    }
}


// Basically we are considering a 2d matrix as a 1d matrix
// so matrix[2][3] = element number 11 in 
// matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
// and on this we are doing binary search
