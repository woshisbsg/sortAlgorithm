public class bubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{8,6,4,1,5,3};
        bubbleSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void bubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j+ 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }




}
