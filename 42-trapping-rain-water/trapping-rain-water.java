class Solution {
  public int trap(int[] height) {
    int total = 0;
    int rightMax = 0;
    int leftMax = 0;
    int arrLength = height.length;
    int[] leftArr = new int[height.length];
    int[] rightArr = new int[height.length];

    leftArr[0] = height[0];
    rightArr[arrLength - 1] = height[arrLength - 1];

    for (int i = 1; i < arrLength; i++) {
      leftMax = Math.max(height[i - 1], leftMax);
      leftArr[i] = leftMax;
    }
    for (int i = arrLength - 2; i >= 0; i--) {
      rightMax = Math.max(height[i + 1], rightMax);
      rightArr[i] = rightMax;
    }

    for (int i = 0; i < arrLength; i++) {
      int maxHeight = Math.min(leftArr[i], rightArr[i]);
      int diff = maxHeight - height[i];
      if (diff > 0) {
        total = total + diff;
      }
    }
    return total;
  }
}