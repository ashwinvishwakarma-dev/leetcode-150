class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Build graph
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];

            graph.get(prerequisiteCourse).add(course);
        }

        // 0 = not visited
        // 1 = visiting
        // 2 = completely processed
        int[] state = new int[numCourses];

        for (int course = 0; course < numCourses; course++) {

            if (hasCycle(course, graph, state)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasCycle(
            int course,
            List<List<Integer>> graph,
            int[] state) {

        // Currently in this DFS path
        if (state[course] == 1) {
            return true;
        }

        // Already completely processed
        if (state[course] == 2) {
            return false;
        }

        // Mark as currently visiting
        state[course] = 1;

        for (int next : graph.get(course)) {

            if (hasCycle(next, graph, state)) {
                return true;
            }
        }

        // Finished exploring this course
        state[course] = 2;

        return false;
    }
}