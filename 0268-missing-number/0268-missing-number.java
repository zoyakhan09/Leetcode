class Solution {
    public int missingNumber(int[] nums) {
    int res = 0;
	Arrays.sort(nums);
	if (nums[0] == 0 && nums.length == 1) {
		res = 1;
	} else {
		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {
				if (i != nums[i]) {
					res = nums[i] - 1;
					break;
				} else {
					res = nums[nums.length - 1] + 1;
				}
			}
		} else {
			res = nums[0] - 1;
		}
	}
	System.out.println(res);
	return res;

        
    }
}