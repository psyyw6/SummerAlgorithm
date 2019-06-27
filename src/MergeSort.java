public class MergeSort {

    public static void merge(int[] A, int p, int q, int r){
        int n_1 = q - p + 1;
        int n_2 = r - q;
        int[] L = new int[n_1 + 1];
        int[] R = new int [n_2 + 1];
        for (int i = 0; i < n_1; i++){
            L[i] = A[p+i];
        }
        for (int j = 0; j < n_2; j++){
            R[j] = A[q+j+1];
        }
        L[n_1] = (int)Double.POSITIVE_INFINITY;
        R[n_2] = (int)Double.POSITIVE_INFINITY;
        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++){
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }else{
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void sort(int[] A, int p, int r){
        if(p < r){
           int  q = (p + r) / 2;
           sort(A,p,q);
           sort(A,q+1,r);
           merge(A,p,q,r);
        }
    }
}
