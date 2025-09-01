import java.util.Stack;

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
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Byte> s1 = new Stack<>();

        ListNode temp = head;
        for(int i = 0 ; temp != null  ; i++){
            s1.push((byte)temp.val);
            temp = temp.next;
        }
        temp = head;
        for(int i = 0 ; temp != null  ; i++){
            if(temp.val != s1.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}