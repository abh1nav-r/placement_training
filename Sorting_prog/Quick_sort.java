public class Quick_sort {
    static int partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=0;j<high;j++){
        if(low<high){
            if(arr[low]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
            }
        }
    }
    int temp=arr[i+1];
    arr[i+1]=high;
    high=temp;

    return i+1;
}
    static void quicksort(int[] arr,int low, int high){
        if(low<high){
            int pindx=partition(arr, low, high);
            quicksort(arr, low, pindx-1);
            quicksort(arr, pindx+1, high);
        }
    }
    public static void main(String[] args) {
          int arr[] = {6,3,9,5,2,8};

        quicksort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
