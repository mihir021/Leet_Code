/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int a[] = new int[right - left +1];
        ListNode temp = head;
        int fix = 0;
        for(int i = 1 ; i <= right ; i++){
            if(i >= left ){
                a[fix++] = temp.val;
            }
            temp = temp.next;
        }
        temp = head;
        fix = 1;
        for(int i = 1 ; i <= right ; i++){
            if(i >= left ){
                temp.val = a[a.length - fix++];
            }
            temp = temp.next;
        }
        return head;
    }
}