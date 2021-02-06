class CombinationSum {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    
   List<List<Integer>> list= new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(target,0,candidates,list,ll);
        return list;
    }
    
    public void backTrack(int target,int i, int arr[], List<List<Integer>> list, List<Integer>ll){
        
        if(target<0)
            return ;
        else if(target==0){
            list.add(new ArrayList<>(ll));
            
        }else{
            for(int j=i;j<arr.length;j++){
                if(j>i && arr[j]==arr[j-1])continue;
                if(arr[j]<=target){
                    ll.add(arr[j]);
                    backTrack(target-arr[j],j+1,arr,list,ll);
                    ll.remove(ll.size()-1);
                }
            }
        }
        
    }
}