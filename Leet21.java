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
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1!=null && t2!=null){
            if(t1.val>t2.val){
                ans.next = t2;
                ans = ans.next;
                t2 = t2.next;
            }
            else {
                ans.next = t1;
                ans = ans.next;
                t1 = t1.next;
            }
        }
        while(t1!=null){
            ans.next = t1;
            ans = ans.next;
            t1 = t1.next;
        }
        while(t2!=null){
            ans.next = t2;
            ans = ans.next;
            t2 = t2.next;
        }
        return temp.next;
    }
}