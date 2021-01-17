class ProductArray {
    public int[] productExceptSelf(int[] nums) {
            
        int res[] = new int [nums.length];
        if(nums.length==0)return res;
        
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i-1]*res[i-1];
        }
        int mul=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=mul*res[i];
            mul*=nums[i];
        }
        
        return res;
    }
}