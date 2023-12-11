class Solution {
    public int maxSubArray(int[] nums) {
        
        int l; int sum=0; int maximum=Integer.MIN_VALUE;
        l= nums.length; 
        for(int i=0; i<l; i++)
        {   
                sum= sum+nums[i];
                if(sum>maximum)
                maximum=sum;
            if(sum<0)
            sum=0;

        }
        
           return maximum;
    }
        
}
