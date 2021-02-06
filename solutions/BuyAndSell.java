class BuyAndSell{
     public int maxProfit(int[] nums) {
        
        int maxVal=0;
        int minVal=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<minVal)
                minVal=nums[i];
            if(maxVal<nums[i]-minVal){
                maxVal=nums[i]-minVal;
            }
        }
        
        return maxVal;
    }
}