class MaximumSum{
     public int maxSubArray(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
       int max_sum=nums[0];
        int curr_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_sum=Math.max(nums[i],curr_sum+nums[i]);
            max_sum =Math.max(max_sum,curr_sum);
        }
        
        return max_sum;
    }
}