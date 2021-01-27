public class selectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,5,6,8,2,4,9};
        selectionSort(a);
        for(int i = 0 ; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    //CTH sort
    /*
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

     */

    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }



}
