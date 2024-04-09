package Problems1.java;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        RemoveElement remover = new RemoveElement();


        //int[] nums = {3, 2, 2, 3};
        int[] nums = {3, 2, 2, 3,4,5,4};
        //int val = 3;
        int val = 4;
        int k = remover.removeElement(nums, val);
        System.out.println("Output: " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

