class Solution {
     public static int lowerBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }
    
    public int[] rowAndMaximumOnes(int[][] mat) {
         int n = mat.length, m = mat[0].length;
        int maxOnes = 0, rowIndex = 0;

        for (int i = 0; i < n; i++) {
            
            int ones = m - lowerBound(mat[i], 1);
            if (ones > maxOnes) {
                maxOnes = ones;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}
