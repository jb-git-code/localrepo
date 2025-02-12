import java.util.HashMap;

class Solution{
    public int countBadPairs(int nums[]){
        int n=nums.length;
        int totalPairs=n*(n-1)/2;
        int goodPairs=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val=i-nums[i];
            if(map.containsKey(val)){
                int f =map.get(val);
                goodPairs+=f;
            }
            map.put(val,map.getOrDefault(val, 0)+1);
        }
        return (totalPairs-goodPairs);
    }
}