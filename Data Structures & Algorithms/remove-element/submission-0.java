class Solution {
    
//     Input: nums = [0,1,2,2,3,0,4,2], val = 2

//     Output: k = 5, nums = [0,1,3,0,4,_,_,_]
    
    public int removeElement(int[] nums, int val) {
    int k = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++;
        }
    }

    return k;
}
}