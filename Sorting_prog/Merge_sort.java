import java.util.Arrays;

public class Merge_sort{
    static void merge(int[] arr,int st,int end,int mid){
        int [] sort=new int [end-st+1];
        int i=st;
        int j=mid+1;
        int x=0;
        while(i<=mid && j<=end){
            if(arr[i]>=arr[j]){
                sort[x++]=arr[j++];
            }
            else{
                sort[x++]=arr[i++];
            }
        }
        while(i<=mid){
            sort[x++]=arr[i++];
        }
        while(j<=end){
            sort[x++]=arr[j++];
        }
        for(int a=0,b=st;a<sort.length;a++,b++){
            arr[b]=sort[a];
        }
    }
    static void divide(int[] arr,int st,int end){
        if(st>=end){
            return;
        }
        int mid=st+(end-st)/2;
        System.out.println(Arrays.toString(arr));
        divide(arr,st, mid);
        divide(arr,mid+1, end);
        merge(arr, st, end, mid);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length;

        divide(arr, 0, n - 1);

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}