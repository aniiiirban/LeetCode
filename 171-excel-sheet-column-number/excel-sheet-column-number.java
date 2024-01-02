class Solution {
    public int titleToNumber(String columnTitle) {
       int n=columnTitle.length();
        int i=0; int colNum=0;
        while(n>0)
        {
            char ch=columnTitle.charAt(i);
            colNum+= Math.pow(26, n-1)* (ch-64);
            n--; i++;
        }return colNum;
    }
}