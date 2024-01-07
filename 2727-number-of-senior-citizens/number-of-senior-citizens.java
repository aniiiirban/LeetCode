class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        
        for(int i=0; i<details.length; i++)
        {
            if(Character.getNumericValue(details[i].charAt(11))*10+Character.getNumericValue(details[i].charAt(12))> 60)
            c++;

        } return c;
    }
}