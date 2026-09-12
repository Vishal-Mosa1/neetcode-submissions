class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String s = String.valueOf(chars);
                if(map.containsKey(s))
                {
                    int index=map.get(s);
                    result.get(index).add(strs[i]);
                }
                else
                {
                    result.add(new ArrayList<>(Arrays.asList(strs[i])));
                    map.put(s,result.size()-1);
                }
        }
        return result;
    }
}
