class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (p1,p2)->Integer.compare(p1.value,p2.value));
        HashMap<Integer, Integer> map = new HashMap();
        int[] result = new int[k];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        map.forEach((key, value) -> {
            pq.offer(new Pair(key,value));
            if(pq.size()>k)
            {
                pq.poll();
            }
        });

        for(int i=0;i<k;i++)
        {
            Pair pair = pq.poll();
            result[i]=pair.key;
        }

        return result;
    }
}
