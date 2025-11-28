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
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        // for 0 or 1 elements no need to do any...
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode tempF = head.next;
        while (tempF != null){
            if(tempF.val == temp.val ){
                temp.next = tempF.next;
                tempF = tempF.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
}