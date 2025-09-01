import java.util.Arrays;

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
class Solution148 {
    int size(ListNode head){
        ListNode temp = head;
        int ans = 0 ;
        for (; temp != null;temp = temp.next){
            ans++;
        }
        return ans;
    }
    public ListNode sortList(ListNode head) {
        int size = size(head);
        int a[] = new int[size];
        ListNode temp = head;
        for(int i = 0 ; i < size ; i++){
            a[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(a);
        head = null;
        for(int i = size-1 ;  i >= 0; i--){
            ListNode newNode = new ListNode(a[i]);
            if(head == null){
                head = newNode;
            }else {
                newNode.next = head;
                head = newNode;
            }
            //display(head);
        }
        return head;
    }
}