class Solution {
    public int numberOfBeams(String[] bank) {
        int c=0; int prevCount =0; int beams=0;
        for(int i=0; i<bank.length; i++)
        {   
            for(int j=0; j<bank[i].length(); j++)
            {
                if(bank[i].charAt(j)=='1')
                c++;
            }
            if(c>0){
                beams+= prevCount*c;  prevCount=c;
            } 
              c=0;

        } return beams;
    }
}