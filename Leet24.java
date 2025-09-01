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
class Solution24 {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }


        ListNode temp1 = head;
        ListNode temp2 = head.next;
        if(head.next.next == null){
            temp2.next = temp1;
            temp1.next = null;
            return temp2;
        }
        head = temp2;
        ListNode x = null;
        while(temp1.next != null) {
            if(temp2.next == null){
                temp2.next = temp1;
                x.next = temp2;
                temp1.next = null;
                break;
            }
            ListNode t = temp2.next;
            if(x != null){
                temp2.next = temp1;
                temp1.next = t;
                x.next = temp2;
                x = temp1;
                temp1 = t;
                temp2 = t.next;
                continue;
            }
            temp2.next = temp1;
            temp1.next = t;
            x = temp1;
            temp1 = t;
            temp2 = t.next;
        }
        return head;
    }
}