import java.util.HashSet;

class Solution3217 {
    public static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    public static ListNode deleteNode(int n , ListNode head){
        if(head != null){
            if(head.val == n){
                head = head.next;
            }else {
                ListNode temp = head;
                while (temp.next != null && temp.next.val != n){
                    temp = temp.next;
                }
                temp.next = temp.next != null ? temp.next.next : null;
            }
            return head;
        }
        return null;
    }
    public static int size(ListNode head){
        int ans = 0;
        while (head != null){
            ans++;
            head = head.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        System.out.println(size(a1));
        System.out.println(modifiedList(new int[]{1,2,3},a1));
    }
}