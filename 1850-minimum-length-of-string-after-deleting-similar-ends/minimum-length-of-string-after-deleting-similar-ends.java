class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left) == ch)
             left++;
            while (left <= right && s.charAt(right) == ch) 
             right--;
        }
        if(left> right)
        return 0;
        else
        return right - left + 1;
    }
}