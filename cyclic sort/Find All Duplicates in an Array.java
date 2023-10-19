class Solution { 
     public List<Integer> findDuplicates(int[] nums)  { 
         List<Integer> ans= new ArrayList<Integer>(); 
         for(int i=0;i<nums.length;i++) 
         { 
           
          
           if(nums[i]!=nums[nums[i]-1]) 
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
           }
              
         }
         Collections.sort(ans);
         return ans; 
     } 
 }
