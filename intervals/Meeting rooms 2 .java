public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int[] start = new int[A.size()] ;
        int[] end = new int[A.size()] ;
        int i=0,count=0;
        for(ArrayList<Integer> interval : A)
        {
            start[i]=interval.get(0);
            end[i]=interval.get(1);
            i++;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int a=0,b=0,max=0;
        while(a!=start.length)
        {
        
            
            if(start[a]<end[b])
            {
                count++;
                a++;
                
            }
                
            else
            {
                count--;
                b++;
            }
            
            if(count>max)
            {
                max=count;
            }
            
            
        }
        return max;
    }
}

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ArrayList<ArrayList<Integer>> A= new ArrayList<>();
//        A.add(new ArrayList<Integer>());
//        A.add(new ArrayList<Integer>());
//        A.add(new ArrayList<Integer>());
//        A.get(0).add(0);
//        A.get(0).add(30);
//        A.get(1).add(5);
//        A.get(1).add(10);
//        A.get(2).add(15);
//        A.get(2).add(20);
//        int max= solution.solve(A);
//        System.out.println("Max "+ max);
//    }
