class Solution {
    public int search(int[] nums, int target) {

        int left=0; int right=nums.length-1;
        

        while(left<=right)
        { int midInd=(left+right) /2;
            if(nums[midInd]==target)
            return midInd;

            else if(nums[midInd]<target)
            left=midInd+1;

            else 
            right= midInd-1;
        } return -1;

        
    }
}

