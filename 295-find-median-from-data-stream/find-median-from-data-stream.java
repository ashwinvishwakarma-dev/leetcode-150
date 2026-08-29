class MedianFinder {

  List<Integer> list;

  public MedianFinder() {
    list = new ArrayList<>();
  }

  public void addNum(int num) {

    int left = 0;
    int right = list.size();

    while (left < right) {

        int mid = left + (right - left) / 2;

        if (list.get(mid) < num) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    list.add(left, num);
}

  public double findMedian() {
    double index = 0.0;
    if (!list.isEmpty()) {
      int size = list.size();
      int median = size / 2;
      if (size % 2 == 0) {
        index = (double) (list.get(median) + list.get(median - 1)) / 2;
      } else {
        index = list.get(median);
      }
    }
    return index;
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */