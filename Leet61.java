class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        int size1 = size(head);
        if(head == null || size1 == 1){
            return head;
        }
        k = k % size1;
        while (k > 0){
            head = opration(head);
            k--;
        }
        return  head;
    }
    public int size(ListNode head){
        ListNode temp = head;
        int sizevalue = 0;
        while (temp != null){
            temp = temp.next;
            sizevalue++;
        }
        return sizevalue;
    }
    public ListNode opration(ListNode head){
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 1 ; head.next != null ; i++){
            head = head.next;
            if(i > 1){
                temp2 = temp2.next;
            }
        }
        temp2.next = null;
        head.next = temp1;
        return head;
    }
}