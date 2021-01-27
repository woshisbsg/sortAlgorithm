public class shellSort {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,5,63,4,8,7,3,8};
        a = shellSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }


    }
    public static int[] shellSort(int[] arr){
        int len = arr.length;
        for(int gap = (len / 2); gap > 0; gap = (gap / 2)) {
            // 注意：这里和动图演示的不一样，动图是分组执行，实际操作是多个分组交替执行
            for(int i = gap; i < len; i++) {
                int j = i;
                int current = arr[i];
                while(j - gap >= 0 && current < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = current;
            }
        }
        return arr;

    }


}
