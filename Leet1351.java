class Solution1351 {
    public static int countNegatives(int[][] grid) {

        int count = 0;
        for (int [] arr : grid){
            count += floorInSortedArray(arr);
        }
        return count;
    }
    static int floorInSortedArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid ;
        while (low<=high){
            mid = (low+high)/2;
            if(arr[mid]<0){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return arr.length-low;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
}