class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowMax=matrix.length-1,colMax=matrix[0].length-1;
        for (int i=0;i<matrix.length;i++) {
            int lo=0,hi=colMax;
            while (lo<hi) {
                int mid=(lo+hi)/2;
                if (matrix[i][mid]==target || matrix[i][lo]==target || matrix[i][hi]==target) return true;
                else if (matrix[i][mid]>target) hi=mid-1;
                else lo=mid+1;
            }
            colMax=Math.min(lo,colMax);
            if (matrix[i][colMax]==target) return true;
        }
        return false;
    }
}
