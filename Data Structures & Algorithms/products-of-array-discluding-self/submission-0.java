class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProduct; 
            leftProduct *= nums[i];
        }
        // [1,2,3,4]
        // [1]  -> [1, 1]   ->  [1,1, 2]    -> [1,1,2,8]
        //              \              \
        //              1*1            1*2
        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }
}