import java.util.Arrays;

public class H_Index {
    public static int hIndex(int[] citations) {
        int i;
        Arrays.sort(citations);
        for (i = citations.length - 1; i >= 0; i--) {
            if (i + 1 > citations[i]) {
                break;
            }
        }
        return i + 2;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1};
        System.out.println(hIndex(nums));
    }
}
