class Solution1{
    public int[] twoSum(int[] nums, int target) {
        int ans;
        int i=0;
        int fix=0;
        boolean found = false ;
        for (fix = 0; fix < nums.length; fix++) {
            found = false;
            for (i = 1; i < (nums.length); i++) {
                found = false;
                ans = nums[fix] + nums[i];
                if (ans == target){
                    found = true ;
                    if(i != fix)
                        break;
                }
            }
            if(found)
                if(i != fix)
                    break;
        }
        if (found)
            System.out.println("[" + fix  + "]" + "[" + (i)+ "]");
        else
            System.out.println("not found target !!!");
        int ans_in_array[] = new int[2];
        ans_in_array[0]= fix;
        ans_in_array[1]= i;
        return ans_in_array;
        // test change
        // auto-push test





        


    }
}
