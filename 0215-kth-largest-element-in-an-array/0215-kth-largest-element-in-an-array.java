 class Solution {
    Random rand = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickselect(nums, 0, nums.length - 1, nums.length - k);
    }

    int quickselect(int[] nums, int left, int right, int k) {
        while (left <= right) {
            // Randomize pivot selection
            int pivotIndex = rand.nextInt(right - left + 1) + left;
            swap(nums, pivotIndex, right);

            // Three-way partitioning
            int[] partition = partition(nums, left, right);

            // Check where k falls in relation to the partitioned indices
            if (k >= partition[0] && k <= partition[1]) {
                return nums[k];  // If k is within the partitioned range
            } else if (k < partition[0]) {
                right = partition[0] - 1;  // Search in the left part
            } else {
                left = partition[1] + 1;  // Search in the right part
            }
        }
        return -1;  // Fallback, though it should never reach here
    }

    int[] partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left, lt = left, gt = right;

        while (i <= gt) {
            if (nums[i] < pivot) {
                swap(nums, i++, lt++);  // Elements less than the pivot
            } else if (nums[i] > pivot) {
                swap(nums, i, gt--);  // Elements greater than the pivot
            } else {
                i++;  // Elements equal to the pivot
            }
        }
        return new int[]{lt, gt};  // Return the indices of the pivot range
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}