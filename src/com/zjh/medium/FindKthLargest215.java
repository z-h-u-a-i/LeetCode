package com.zjh.medium;

public class FindKthLargest215 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int i = new FindKthLargest215().findKthLargest(nums, k);
        System.out.println(i);
    }

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, k);
    }

    public int quickSort(int[] nums, int startIndex, int endIndex, int k) {
        int pivotIndex = partition(nums, startIndex, endIndex);
        if (pivotIndex + 1 == k) {
            return nums[pivotIndex];
        } else if (pivotIndex + 1 > k) {
            return quickSort(nums, startIndex, pivotIndex - 1, k);
        } else {
            return quickSort(nums, pivotIndex + 1, endIndex, k);
        }
    }

    public int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            while (left < right && nums[right] < pivot) {
                right--;
            }
            while (left < right && nums[left] >= pivot) {
                left++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        int temp = nums[startIndex];
        nums[startIndex] = nums[right];
        nums[right] = temp;
        return right;
    }
}
