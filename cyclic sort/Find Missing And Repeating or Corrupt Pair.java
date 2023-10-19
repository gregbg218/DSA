//same as find all missing
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

class Solve {
    int[] findTwoElement(int nums[], int n) {
        // code here
        List<Integer> ans= new ArrayList<Integer>(); 
        for(int i=0;i<nums.length;i++) 
        { 
        if(nums[nums[i]-1]!=nums[i]) 
             { 
               
                 int temp = nums[nums[i]-1]; 
                 nums[nums[i]-1]=nums[i]; 
                 nums[i]=temp; 
                
                 
                 if(nums[nums[i]-1]!=nums[i]) // this is done if the number swapped still does not                                                      belong 
                  {   
                    i--; 
                  }
                
             } 
        }
         for(int i=0;i<nums.length;i++)
         {
           // System.out.println(" "+nums[i]);          
           if(nums[i]!=i+1)
           {
             ans.add(nums[i]);
             ans.add(i+1);  
           }
              
         }
         
    
         return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
