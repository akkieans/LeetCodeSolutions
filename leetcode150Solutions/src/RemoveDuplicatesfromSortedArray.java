import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> vals = new HashMap<>();
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (!vals.containsKey(nums[i])) {
                index++;
                nums[index] = nums[i];
                vals.put(nums[i], i);
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
