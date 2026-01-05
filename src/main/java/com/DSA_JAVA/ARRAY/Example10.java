package com.DSA_JAVA.ARRAY;

public class Example10
{
   public int majorityElementBrute(int[] nums, int n)
   {
       int target;
       int count = 0;
       int ans = -1;

       for(int i=0; i < n; i++)
       {
           target = nums[i];
           count = 0;

           for(int j=i; j < n; j++)
           {
               if(target == nums[j])
               {
                   count++;
               }
           }

           if(count >= n/2)
           {
               ans = target;
               break;
           }

       }

       return ans;
   }

    public static void main(String[] args)
    {
        int A[] = {2,3,3,3,1,3,3};
        int n = A.length;

        Example10 obj = new Example10();
        int ans = obj.majorityElementBrute(A, n);
        System.out.println("Majority Element: " + ans);
    }
}
