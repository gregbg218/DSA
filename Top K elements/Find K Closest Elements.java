import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

    class Pair{
        int key;
        int value;

        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }

    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Comparator<Pair> pairComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                if(a.value==b.value)
                    return b.key-a.key;
                return b.value-a.value;
            }
        };
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(pairComparator);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            maxHeap.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        while(maxHeap.size()!=0)
        {
            res.add(maxHeap.poll().key);
        }

        Collections.sort(res);
        return res;
    }
}

//Comparator logic:
//a=8 b=3

//a-b =5
//a>b
//so b comes before a(ascending order)

//b-a =-5
//a<b
//so a comes before b (descending order)


// Collections.sort(res); becos we are 
// sorting based on distance from x or target variable and not a simple ascending order

