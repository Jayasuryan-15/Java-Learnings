package Problems;

public class DuplicateNumber {
    public static void main(String args[]){
        int[] nums={9,13,17,13,17,13,17};
        int count = 0;

        for(int i=0;i< nums.length;i++){
            for(int j = i+1; j<nums.length; j++){



                if(nums[i] == nums[j] ) {
                    System.out.print(nums[i]+" ");
                    System.out.print(nums[j]+" ");
                    count++;
                }






            }
    }
        System.out.println("  DuplicateNumbers  count "+count);


    }
}
