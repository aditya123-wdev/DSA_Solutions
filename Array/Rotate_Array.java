public void reverseArr(int start, int end, int[] nums) {
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        reverseArr(0, n - 1, nums);
        reverseArr(0, k - 1, nums);
        reverseArr(k, n - 1, nums);
    }
