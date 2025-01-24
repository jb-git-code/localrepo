
class Solution {
    public List<Integer> findSafeStates(int[][] graph){
        int n=graph.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int node =0;node<n;node++){
            if(dfs(node,graph,map)){
                res.add(node);
            }
        }
        return res;
    } 
    static boolean dfs(int node , int[][] graph , HashMap<Integer,Boolean> map ){
        if(map.conatainsKey(node)){
            return map.get(node);
        }
        map.put(node,false);
        for(int neighbour : graph[node]){
            if(!dfs(neighbour, graph, map)){
                return false;
            }
        }
        map.put(node,true);
        return true;
    }
}
