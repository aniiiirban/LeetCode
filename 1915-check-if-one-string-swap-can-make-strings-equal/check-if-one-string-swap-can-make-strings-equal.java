class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int temp1[] = new int[26] , temp2[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            int a1 = s1.charAt(i)-'a', a2 = s2.charAt(i)-'a';
            temp1[a1]++; temp2[a2]++;  
        }
        for(int i=0; i<temp1.length; i++){
            if(temp1[i]!=temp2[i]) return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) count++;
            if(count>2) return false;
        }
        return true;
    }
}