class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int[] acc:accounts){
            int sum=0;
            for(int i:acc){
                sum+=i;
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}