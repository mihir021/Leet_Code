class Solution3516{
    public int findClosest(int x, int y, int z) {

        if((int)Math.abs(x-z) > ((int)Math.abs(y-z))){
            return 2;
        }
        if((int)Math.abs(x-z) < ((int)Math.abs(y-z))){
            return 1;
        }
        return 0;
    }
}