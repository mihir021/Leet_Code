import java.util.Arrays;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int MargedList[] = new int[nums1.length + nums2.length];
        int i = 0;
        while (nums1.length > i){
            MargedList[i] = nums1[i++];
        }
        int i2 = 0;
        while (nums2.length > i2){
            MargedList[i++] = nums2[i2++];
        }
        Arrays.sort(MargedList);
        if(MargedList.length % 2 == 0){
            return (double) ((MargedList[MargedList.length / 2] + MargedList[(MargedList.length / 2) - 1])) /2;
        }
        return (MargedList[MargedList.length/2]);
    }
}