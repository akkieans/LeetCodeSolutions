public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = -1;
        for (int i=0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
}
