class Solution {
    public int firstUniqChar(String s) {
        int c=0; int len=s.length();
        if(len==1)
        return 0;
        for(int i=0; i<len; i++)
        {   c=0;
            for(int j=0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    c=1; break;
                }
            }
                for(int k=i+1; k<len; k++){
                    if(s.charAt(i)==s.charAt(k)){
                        c=1; break;
                    }
                } if(c==0)
                    return i;
        } return -1;
        
    }
}