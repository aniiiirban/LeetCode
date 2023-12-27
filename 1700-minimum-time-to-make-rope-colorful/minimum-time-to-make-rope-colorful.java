class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totTime=0; int max=neededTime[0];
        for(int i=0; i<colors.length()-1; i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
                totTime+= Math.min(max, neededTime[i+1]); 
                max= Math.max(neededTime[i+1], max);
            }
            else max=neededTime[i+1];
        } return totTime;
    }
}