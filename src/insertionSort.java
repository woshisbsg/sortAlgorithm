import java.util.Vector;

public class insertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,2,5};
         a =Sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
    /*
    //自己写的
    public static int[] sort(int[] arr){
        Vector<Integer> v = new Vector();
        for(int i = 0; i < arr.length; i++){
            v.add(arr[i]);
        }
        int counter = 1;
            for(int j = 1; j < v.size(); j++){
                while(v.get(j) < v.get(j - counter)){
                    counter++;
                }
                v.insertElementAt(v.get(j),j-counter + 1);
                v.remove(j + 1);
                counter = 1;
            }

           // arr = v.stream().mapToInt(Integer::valueOf).toArray();
            arr = v.stream().mapToInt(Integer::intValue).toArray();
            return arr;

        //System.out.println(v);
    }

     */
    //网上的方法：
    public static int[] Sort(int []arr) {
        int len = arr.length;
        int preIndex, current;
        for(int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while(preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
