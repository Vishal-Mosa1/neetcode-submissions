class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        if(nums.length==0)
        {
            return 0;
        }

        for(int i:nums)
        {
            set.add(i);
        }

        for(int i:set)
        {
            int val=i-1;
            if(!set.contains(val))
            {
                int currentNum = i;
                int currentStreak = 1;
                while(set.contains(currentNum + 1))
                {
                    currentNum += 1;
                    currentStreak += 1;
                }
                max = Math.max(max, currentStreak);
            }
        }
        return max;
    }
}