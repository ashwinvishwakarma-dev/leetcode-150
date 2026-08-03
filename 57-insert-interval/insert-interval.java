class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    if (newInterval.length == 0) {
			return intervals;
		}
		
		List<int[]> result = new ArrayList<>();
		int newStart = newInterval[0];
		int newEnd = newInterval[1];
		boolean isInsert = false;
		
		if (intervals.length == 0) {
			result.add(new int[]{newStart, newEnd});
			return result.toArray(new int[1][]);
		}

    //		1. Insert newInterval in sorted position
    for (int i = 0; i < intervals.length; i++) {
      int start = intervals[i][0];
      int end = intervals[i][1];

      if (!isInsert && newStart <= start) {
        result.add(new int[] { newStart, newEnd });
        isInsert = true;
      }
      result.add(new int[] { start, end });
    }

    if (!isInsert) {
			result.add(new int[]{newStart, newEnd});
		}

    int[][] updateInterval = result.toArray(new int[result.size()][]);
    result.clear();

    //		2. Merge overlapping interval

    int start1 = updateInterval[0][0];
    int end1 = updateInterval[0][1];

    for (int i = 1; i < updateInterval.length; i++) {
      int start2 = updateInterval[i][0];
      int end2 = updateInterval[i][1];

      if (end1 >= start2) {
        end1 = Math.max(end1, end2);
      } else {
        result.add(new int[] { start1, end1 });
        start1 = start2;
        end1 = end2;
      }
    }
    result.add(new int[] { start1, end1 });

    return result.toArray(new int[result.size()][]);
  }
}