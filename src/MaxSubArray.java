public class MaxSubArray {

    public  class MSAOutput{

        private int low;
        private int high;
        private int sum;

        public MSAOutput(){

        }

        public MSAOutput(int low, int high, int sum){
            this.setLow(low);
            this.setHigh(high);
            this.setSum(sum);
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        public int getLow() {
            return low;
        }

        public void setLow(int low) {
            this.low = low;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }

    public MSAOutput FindMaxCrossingSubArray(int[] A, int low, int mid, int high){
        MSAOutput crossOutput = new MSAOutput();
        int leftSum = (int)Double.NEGATIVE_INFINITY;
        int sum = 0;
        for (int i = mid; i >= low; i--){
            sum += A[i];
            if(sum > leftSum){
                leftSum = sum;
                crossOutput.setLow(i);
            }
        }
        int rightSum = (int)Double.NEGATIVE_INFINITY;
        sum = 0;
        for (int j = mid+1; j <= high; j++){
            sum += A[j];
            if(sum > rightSum){
                rightSum = sum;
                crossOutput.setHigh(j);
            }
        }
        crossOutput.setSum(leftSum + rightSum);
        return  crossOutput;
    }

    public MSAOutput FindMaximumSubArray(int[] A, int low, int high){
        if(low == high){
            return new MSAOutput(low,high,A[low]);
        }else{
            int mid = (low + high)/2;
            MSAOutput leftOutput = FindMaximumSubArray(A,low, mid );
            MSAOutput rightOutput = FindMaximumSubArray(A,mid + 1,high);
            MSAOutput crossOutput = FindMaxCrossingSubArray(A,low,mid,high);

            if(leftOutput.getSum() >= rightOutput.getSum() && leftOutput.getSum() >= crossOutput.getSum()){
                return leftOutput;
            }else if(rightOutput.getSum() >= leftOutput.getSum() && rightOutput.getSum() >= crossOutput.getSum()){
                return rightOutput;
            }else{
                return crossOutput;
            }
        }
    }
}
