public class quickSort {
    public static void main(String[] args) {
        int[]a=new int[]{50,10,90,30,70,40,80,60,20};

        int [] k=qs(a,0,a.length-1);

        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }

    }
    public static int[] qs(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int pivotIndex=partition(arr,leftIndex,rightIndex);  //定义pivotIndex中间位置。partition是检索这个方法
            qs(arr,leftIndex,pivotIndex-1);              //排序左半边
            qs(arr,pivotIndex+1,rightIndex);               //排序右半边
        }
        return arr;


    }

    public static int partition(int[] arr, int leftIndex, int rightIndex){
        int i = leftIndex;
        int j = rightIndex;
        int pivot = arr[leftIndex];
        while(i != j){
            while(arr[j] > pivot && i<j){
                j --;
            }
            while(arr[i] <= pivot && i<j){
                i ++;

            }
            //System.out.println("asdasdasdasdasdasdasd");
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }




        arr[leftIndex] = arr[j];
        arr[j] = pivot;


        return j;
    }
}

