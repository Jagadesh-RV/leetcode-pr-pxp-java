class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        int sum=(n*(n+1))/2;
        int sumofnums=0;
        for(int i=0;i<n;i++){
            sumofnums=sumofnums+nums[i];
        }
        res=sum-sumofnums;
        return res;
    }
}