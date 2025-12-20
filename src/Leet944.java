class Solution944 {
    public int minDeletionSize(String[] strs) {
        int delete = 0;
        int cols = strs[0].length();
        for (int j = 0; j < cols; j++){
            for(int i = 0; i< strs.length-1; i++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    delete++;
                    break;
                }
            }
        }
        return delete;
    }
}