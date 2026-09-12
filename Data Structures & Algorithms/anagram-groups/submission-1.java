class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> res = new HashMap<>();
        int[] count = new int[26];
        for(String s: strs)
        {
            for(char c:s.toCharArray())
            {
                count[c-'a']++;
            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);

            count = new int[26];
        }
        return new ArrayList<>(res.values());
    }
}
