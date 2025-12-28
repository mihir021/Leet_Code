import java.util.PriorityQueue;

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
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode head;
        for (ListNode list : lists) {
            head = list;
            while (head != null) {
                pq.add(head.val);
                head = head.next;
            }
        }
        ListNode ans = new ListNode();


    }
    int size(ListNode head){
        ListNode temp = head;
        int ans = 0 ;
        for (; temp != null;temp = temp.next){
            ans++;
        }
        return ans;
    }

}