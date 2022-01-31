class Solution{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int idx=0, i=idx, sum=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<arr.length){
            sum+=arr[i];
            if(sum<s){
                i++;
                continue;
            }
            if(sum>s){
                idx++;
                i=idx;
                sum=0;
            }
            if(sum==s){
                ans.add(idx+1);
                ans.add(i+1); 
                break;
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }else{
            return ans;
        }
    }
}
