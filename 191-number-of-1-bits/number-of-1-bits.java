public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c=0; 
        String str= Integer.toBinaryString(n);

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='1')
            c++;
        } return c;
    }
}