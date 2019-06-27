public class InsertionSort {

    public static int[] sort(int[] unsortedArray){
        for(int j = 1; j < unsortedArray.length; j++){
            int key = unsortedArray[j];
            int i = j -1;
            while(i >= 0 && unsortedArray[i] > key){
                unsortedArray[i+1] = unsortedArray[i];
                i = i -1;
            }
            unsortedArray[i+1] = key;
        }
        return unsortedArray;
    }
}
