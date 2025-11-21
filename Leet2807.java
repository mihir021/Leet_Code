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
class Solution2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentNode = head;
        ListNode nextNode;
        if(head.next!=null) nextNode = head.next;
        else return head;

        while(nextNode!=null){
            ListNode temp = new ListNode(greatestCommonDivisor(currentNode.val, nextNode.val));
            currentNode.next = temp;
            temp.next = nextNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
    int greatestCommonDivisor(int a, int b){
        int temp;
        while (b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}