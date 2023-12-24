class Solution {
    public int minOperations(String s) {
        int c=0;
        if(s.length()==1) return 0;
        for(int i=0; i< s.length(); i++)
        {
            if(i%2==0 && s.charAt(i)=='0') c++;
            if(i%2==1 && s.charAt(i)=='1') c++;
        }
        return Math.min(c, s.length()-c);

    }
}