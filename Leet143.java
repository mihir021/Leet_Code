import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution143 {
    public void reorderList(ListNode head) {
        int size = size(head);
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        temp = head;
        for(int i = 0 ; i < (size/2) ; i++){
            ListNode lastNode = stack.pop();
            lastNode.next = temp.next;
            temp.next = lastNode;
            temp = lastNode.next;
        }
        temp.next = null;
    }
    static int size(ListNode head){
        ListNode temp = head;
        int ans = 0 ;
        for (; temp != null;temp = temp.next){
            ans++;
        }
        return ans;
    }
}