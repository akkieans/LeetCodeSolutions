public class JumpGame2 {
    public static int jump(int[] nums) {
        int reachable = 0, steps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + nums[i] > reachable) {
                steps += 1;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return steps -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,0,1,4};
        System.out.println(jump(nums));
    }
}
