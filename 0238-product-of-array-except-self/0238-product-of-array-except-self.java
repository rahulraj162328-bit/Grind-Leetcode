class Solution {
    public int[] productExceptSelf(int[] nums){
        int mul=1; int zeroIndex=0; int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                mul=mul*nums[i];
                
            }else{
                zeroIndex=i;
                count++;
            }
        }
        if(count>1){
          Arrays.fill(nums,0);
            return nums;
        }else if(count==1){
            Arrays.fill(nums,0);
            nums[zeroIndex]=mul;
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=mul/nums[i];
        }
    return nums;    
    }
}