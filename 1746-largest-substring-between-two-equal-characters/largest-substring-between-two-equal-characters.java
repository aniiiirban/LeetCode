// class Solution {
//     public int maxLengthBetweenEqualCharacters(String s) {
//         int c=0; int max=-1;
//         for(int i=0; i<s.length(); i++)
//         {
//             for(int j=i; j<s.length(); j++)
//             {
//                 if(s.charAt(i)!=s.charAt(j))
//                 c++;
//                 else c=0;
//             } max= Math.max(max,c);
//         } return max;
//     }
// }

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    ans = Math.max(ans, right - left - 1);
                }
            }
        }
        
        return ans;
    }
}
