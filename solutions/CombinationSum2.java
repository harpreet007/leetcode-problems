class combinationSum2{
     public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        dfs(n,k,1,list,ll);
        return list;
    }
    
    public void dfs(int n, int k, int idx,List<List<Integer>> list,List<Integer> ll){
        if(n<0)
            return ;
        else if(n==0 && ll.size()==k){
            list.add(new ArrayList<>(ll));
            return ;
        }else{
            for(int i=idx;i<=9;i++){
                if(i<=n){
                    ll.add(i);
                    dfs(n-i,k,i+1,list,ll);
                    ll.remove(ll.size()-1);
                }
            }
        }
    } 
}