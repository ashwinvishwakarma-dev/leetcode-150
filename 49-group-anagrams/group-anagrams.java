class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> listList = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = Arrays.toString(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        listList.addAll(map.values());

        return listList;

    }
}