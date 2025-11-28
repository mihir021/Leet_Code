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
class Solution328 {
    int size(ListNode head){
        ListNode temp = head;
        int ans = 0;
        while (temp!= null){
            ans++;
            temp = temp.next;
        }
        return ans;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode tail = head;
        ListNode temp = head;
        ListNode tempF = head.next;
        for(;tail.next != null; tail = tail.next);
        int size = size(head);
        for(int i = 0 ; i < (size/2) ; i++){
            temp.next = tempF.next;
            ListNode addLast = tempF;
            temp = tempF.next;
            tempF = temp.next;
            tail.next = addLast;
            tail = addLast;
            tail.next = null;
        }
        return head;
    }
}