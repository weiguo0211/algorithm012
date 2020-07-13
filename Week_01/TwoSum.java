public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new  HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(Integer.valueOf(nums[i]),Integer.valueOf(i));
        }
        for(int i = 0;i<nums.length;i++){
            Integer j = map.get(Integer.valueOf(target-nums[i]));
            if(j != null&&j.intValue()!=i){
                int[] ret = {i, j.intValue()};
                return ret;
            }
        }
        return null;
    }
}