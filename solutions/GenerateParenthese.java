class GenerateParenthese{
      List<String> list = new ArrayList<>();
        dfs(list,"",0,0,n);
        return list;
    }
    
    public void dfs(List<String>list,String str,int open ,int close,int max){
        if(str.length()==2*max){
            list.add(str);
            return;
        }else{
            if(open<max)
                dfs(list,str+'(',open+1,close,max);
            
            if(close<open)
                dfs(list,str+')',open,close+1,max);
        }
    }
}