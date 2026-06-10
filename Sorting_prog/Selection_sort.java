import java.util.Arrays;

public class Selection_sort {
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int left=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[left]){
                    left=j;
                }
            }
            if(left!=i){
            int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,8,2,7,3,6};
        sort(arr);
    }
}
