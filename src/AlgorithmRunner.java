public class AlgorithmRunner {
    public static void main(String[] args) {
//        int[] unsortedArray = new int[]{5,2,4,6,1,3};
//        int[] sortArray = InsertionSort.sort(unsortedArray);
//        ArrayPrinter.print(sortArray);

        int[] unsortedArray = new int[]{5,2,4,6,1,3,2,7,-12,5};
//        MergeSort.sort(unsortedArray,0,unsortedArray.length - 1);
//        ArrayPrinter.print(unsortedArray);

        MaxSubArray maxSubArrayTester = new MaxSubArray();
        MaxSubArray.MSAOutput output = maxSubArrayTester.FindMaximumSubArray(unsortedArray,0,unsortedArray.length-1);
        System.out.println(output.getLow()+ " "+output.getHigh()+" "+output.getSum());
    }
}
