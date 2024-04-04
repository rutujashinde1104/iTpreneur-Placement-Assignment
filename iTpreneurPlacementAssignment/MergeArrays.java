package iTpreneurPlacementAssignment;

public class MergeArrays {
	

	    public static void mergeArrays(int[] X, int[] Y) {
	        int m = X.length;
	        int n = Y.length;

	    
	        int i = m - n - 1;

	        int j = 0;


	        int k = 0;

	        int[] temp = new int[m];

	        while (i >= 0 && j < n) {
	            if (X[i] < Y[j]) {
	                temp[k++] = X[i--];
	            } else {
	                temp[k++] = Y[j++];
	            }
	        }

	        while (j < n) {
	            temp[k++] = Y[j++];
	        }

	        while (i >= 0) {
	            temp[k++] = X[i--];
	        }

	        for (int l = m - 1; l >= 0; l--) {
	            X[l] = temp[--k];
	        }
	    }

	    public static void main(String[] args) {
	        int[] X = {0, 3, 0, 3, 0, 8, 9, 0, 0};
	        int[] Y = {1, 1, 10, 15};

	        mergeArrays(X, Y);

	        for (int num : X) {
	            System.out.print(num + " ");
	        }
	    }
	}
	    