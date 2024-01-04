class Solution {
    public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> lst = new ArrayList<>();
	
    List<Integer> curr = new ArrayList<>();
    
    generateSubsets(lst,curr,nums,0);
    return lst;
    
}
static void generateSubsets(List<List<Integer>> lst,List<Integer> curr,int nums[],int i){
    if(i == nums.length){
        lst.add(new ArrayList<>(curr));
        return;
    }
    curr.add(nums[i]);
    generateSubsets(lst,curr,nums,i+1);
    curr.remove(curr.size()-1);
    generateSubsets(lst,curr,nums,i+1);
}

    
    
}