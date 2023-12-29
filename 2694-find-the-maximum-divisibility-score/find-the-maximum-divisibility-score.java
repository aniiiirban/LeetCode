// class Solution {
//     public int maxDivScore(int[] nums, int[] divisors) {
// //         int max=0; int c=0; int res=0;
// //         for(int i=0; i<divisors.length; i++)
// //         {   max=Math.max(c, max);
// //             c=0;
// //             for(int j=0; j< nums.length; j++)
// //             {
// //                 if(nums[j]%divisors[i]==0)
// //                 ++c;
// //                 if(c>max)
// //                 res=divisors[i];
// //             }
// //         } return res;
// //     }
// // }

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        
       
        int a=0;
        int aa=Integer.MAX_VALUE;
        for(int i=divisors.length-1;i>=0;i--){
            int d=divisors[i];
             int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%d==0)
                c++;
            }
            if(c==a){
                aa=Math.min(aa,d);

            }
            if(c>a){
                a=c;
                aa=d;

            }
        }
        return aa;
    }
}