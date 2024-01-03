import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(elementCount.containsKey(nums[i])){
                elementCount.put(nums[i], elementCount.get(nums[i])+1);
            }
            else{
                elementCount.put(nums[i],1);
            }
        }
        return Collections.max(elementCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));
    }
}
