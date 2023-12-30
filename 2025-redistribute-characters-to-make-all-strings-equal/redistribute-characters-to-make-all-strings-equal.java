class Solution {
    public boolean makeEqual(String[] words) {
        int countArr[]= new int[26]; int charVal=0;
      for(int i=0; i<words.length; i++) //words lelements
      {
          for(int j=0; j<words[i].length(); j++)
          {   
             charVal= words[i].charAt(j)-'a';
             countArr[charVal]++;
          }
      }
        for(int i=0; i<26; i++){
             if(countArr[i]!=0 && countArr[i]% words.length !=0)
                return false;
        }
       
        return true;      
    }
}