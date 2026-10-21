class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i]+sum;
        }
        int leftSum=0;
        int i=0;
        while(i<nums.length){
            if(i>0){
                leftSum=leftSum+nums[i-1];
            }
            sum=sum-nums[i];
            if(leftSum==sum){
                return i;
            }
            i++;
        }
        return -1;
    }
}