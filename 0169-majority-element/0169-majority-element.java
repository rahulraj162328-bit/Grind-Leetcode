class Solution {
    public int majorityElement(int[] nums) {
        int current=0;
        int count=0;
        for(int n:nums){
            if(count==0){
                current=n;
                count=1;
            }else if(current==n){
                count++;
            }else{
                count--;
            }
        }
        int mainCount=0;
        for(int i:nums){
            if(i==current){
                mainCount++;
            }
        }
        if(mainCount>nums.length/2){
            return current;
        }
        return -1;


    }
}
    //     Map<Integer,Integer> m=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(m.containsKey(nums[i])){
    //             m.put(nums[i],m.get(nums[i])+1);    
    //         }else{
    //             m.put(nums[i],1);
                
    //         }
    //         if(m.get(nums[i])>nums.length/2){
    //                 return nums[i];
    //         }
            
    //     }
        

    // return 0;