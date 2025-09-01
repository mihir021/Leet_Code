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
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        if(n == size(head) ){
            ListNode temp = head;
            head = head.next;
            temp = null;
            return  head;
        }
        int stop = size(head) - n;
        ListNode temp = head;
        for(int i = 1 ; i != stop ; temp = temp.next ){
            i++;
        }
        ListNode temp2 = temp.next.next;
        temp.next = temp2;

        return head;
    }
    int size(ListNode head){
        int i = 0;
        ListNode temp = head;
        for(i = 0 ;temp != null ;i++,temp = temp.next){

        }
        return i;
    }
}