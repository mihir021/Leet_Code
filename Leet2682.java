class Solution2282 {
    public int[] circularGameLosers(int n, int k) {

        int [] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = (i+1);
        }
        int j = 0;
        int c = 0;
        for(int i = 0;  ; i += (++j)*k){
            if(nums[(i)%n]==0){
                break;
            }
            else{
                nums[i%n] = 0;
                c++;
            }
        }
        int a[] = new int[n-c];
        int y = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                a[y++] = nums[i];
            }
        }
        return a;
    }
}