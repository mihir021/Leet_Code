class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int size = arr.length;
        int max = 0;
        int ans = 0;
        for(int i = 0 ; i < size-1 ; i++){
            if(max < arr[i]){
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}