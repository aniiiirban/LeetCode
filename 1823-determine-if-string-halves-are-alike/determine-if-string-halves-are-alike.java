class Solution {
    public boolean halvesAreAlike(String s) {
        String v= "aeiouAEIOU";
        int c=0; int c2=0;
        for(int i=0; i<s.length()/2; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(s.charAt(i)==v.charAt(j))
                c++;
            }
        }

        for(int i=s.length()/2; i<s.length(); i++)
        {
            for(int j=0; j<10; j++)
            {
                if(s.charAt(i)==v.charAt(j))
                c2++;
            }
        } return (c==c2);
    }
}