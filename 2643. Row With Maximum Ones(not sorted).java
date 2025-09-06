class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int maxOnes = 0, rowIndex = 0;

        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) ones++;
            }
            if (ones > maxOnes) {
                maxOnes = ones;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}
