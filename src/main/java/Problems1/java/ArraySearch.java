package Problems1.java;

public class ArraySearch {
    public static void main(String args[]){
        int[]arr={5,2,3,4,5,6,7};
        ArraySearch arraySearch=new ArraySearch();
        arraySearch.print(arr);
        arraySearch.search(arr,3);
    }

    private void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }

    private void search(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if(target==arr[i])
                System.out.print(i+ " " + Boolean.TRUE);

        }

    }




}
