class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int len=1;

        if(nums.length==1)
        {
            return 1;
        }

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1 || nums[i]==nums[i-1])
            {
                if(nums[i]==nums[i-1])
                {
                    len=len;
                }
                else
                {
                    len=len+1;
                }
                max=Math.max(max,len);
            }
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i-1]+1)
            {
                len=1;
                max=Math.max(max,len);
            }
        }
        return max;
    }
}
