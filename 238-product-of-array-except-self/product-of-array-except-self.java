class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]= new int[nums.length];
        int prefixPro=1;
        int suffixPro=1;
        for(int i=0; i<nums.length; i++)
        {
            answer[i]= prefixPro;
            prefixPro= prefixPro* nums[i];
        }
        for(int i=nums.length-1; i>=0; i--)
        {
            answer[i]=answer[i]*suffixPro;
            suffixPro*=nums[i];
        }
        return answer;
    } 
}