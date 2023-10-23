/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findPeakElement(MountainArray mountainArr) {
        int start=0,end=mountainArr.length()-1;
        if(mountainArr.length()==1)
            return 0;

        while(start<=end){
            int mid=(start+end)/2;
            int midElement=mountainArr.get(mid);   // Becos the problem constraints allows only 100 times
                                                   // mountainArr.get()

            if(mid>0 && mid<mountainArr.length()-1)
            {
                if(midElement>mountainArr.get(mid+1) && midElement>mountainArr.get(mid-1))
                {
                    return mid;
                }
                else if(midElement<mountainArr.get(mid-1))
                {
                    end=mid-1;
                }
                else if(midElement<mountainArr.get(mid+1))
                {
                    start=mid+1;
                }
            }
            else if(mid==0)
            {
                if(mountainArr.get(0)>mountainArr.get(1))
                    return 0;
                else
                    return 1;
            }
            else if (mid == end)
            {
                if(mountainArr.get(mountainArr.length()-1)>mountainArr.get(mountainArr.length()-2))
                    return mountainArr.length()-1;
                else
                    return mountainArr.length()-2;
            }
        }
        return -1;
    }

    public int normalBinarySearch(MountainArray mountainArr, int target, int low, int high)
    {
        int result=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int midElement=mountainArr.get(mid); // Becos the problem constraints allows only 100 times
                                                // mountainArr.get()

            if(target<midElement)
            {
                high=mid-1;

            }
            else if(target>midElement)
            {
                low = mid+1;
            }
            else if(target==midElement)
            {
                result=mid;
                break;
            }
        }
        return result;
    }

    public int descBinarySearch(MountainArray mountainArr, int target, int low, int high)
    {
        int result=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int midElement=mountainArr.get(mid); // Becos the problem constraints allows only 100 times
                                                // mountainArr.get()

            if(target<midElement)
            {

                low = mid+1;
            }
            else if(target>midElement)
            {
                high=mid-1;
            }
            else if(target==midElement)
            {
                result=mid;
                break;
            }
        }
        return result;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElement = findPeakElement(mountainArr);
        if(peakElement!=-1 && mountainArr.get(peakElement)==target)
            return peakElement;

        int res=normalBinarySearch(mountainArr,target,0,peakElement-1);

        if(res!=-1)
            return res;



        res=descBinarySearch(mountainArr,target,peakElement+1,mountainArr.length()-1);

        if(res!=-1)
            return res;




        return -1;

    }
}
