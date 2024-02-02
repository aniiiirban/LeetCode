class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str="123456789";
        List<Integer> result = new ArrayList<>();
        for( int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<=str.length(); j++)
            {   int a= Integer.parseInt(str.substring(i,j));
                if(a>=low && a<=high)
                result.add(a);
            }
            Collections.sort(result);
        } return result;
    }
}