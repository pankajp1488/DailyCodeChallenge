public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        // Store maximum answer
        int maxSum = Integer.MIN_VALUE;

        // Select starting point
        for (int i = 0; i < nums.length; i++) {

            // Current subarray sum
            int currentSum = 0;

            // Extend subarray
            for (int j = i; j < nums.length; j++) {

                // Add current element
                currentSum += nums[j];

                // Update maximum sum
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}