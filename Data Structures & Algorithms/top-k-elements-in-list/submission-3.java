class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1];
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<freq.length;i++)
        {
            freq[i] = new ArrayList<>();
        }

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        map.forEach((key,value)->{
            freq[value].add(key);
        });

        int index=0;
        for(int i=freq.length-1;i>0 && index<k;i--)
        {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
