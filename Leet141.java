/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f){
                return true;
            }
        }
        return false;
    }
}