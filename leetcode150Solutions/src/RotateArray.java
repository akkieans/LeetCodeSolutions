import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] revrsedArray = Arrays.copyOf(nums, nums.length);
        for (int i = nums.length - 1,j=0; i >= 0; i--,j++) {
            nums[j] = revrsedArray[i];
        }
        for(int i=0; i<k; i++){
            
        }
        int[] firstHalf = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] secondHalf = Arrays.copyOfRange(nums, 0, nums.length - k);
        for (int i = 0; i < firstHalf.length; i++) {
            nums[i] = firstHalf[i];
        }
        for (int i = nums.length - secondHalf.length, j = 0; i < nums.length && j < secondHalf.length; i++, j++) {
            nums[i] = secondHalf[j];
        }
//        for(int i = 0; i<k; i++){
//            int carry = nums[nums.length-1];
//            for(int j= 0; j<nums.length; j++){
//                int currentNum = nums[j];
//                nums[j] = carry;
//                carry = currentNum;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
