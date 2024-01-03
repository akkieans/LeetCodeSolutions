import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int prevnum = -1, count = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == prevnum && count < 2) {
                index++;
                count++;
                prevnum = nums[i];
                nums[index] = nums[i];
            } else if (nums[i] != prevnum && count <= 2) {
                index++;
                count = 1;
                prevnum = nums[i];
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
