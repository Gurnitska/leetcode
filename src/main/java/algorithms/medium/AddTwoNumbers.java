package algorithms.medium;

import algorithms.util.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeSum = new ListNode(0);
        ListNode current = nodeSum;
        boolean inMemory = false;
        while(l1 != null || l2 != null){
            int value1 = l1 !=null ? l1.val : 0;
            int value2 = l2 !=null ? l2.val : 0;

            int intSum = value1 + value2;
            if(inMemory){
                intSum++;
            }
            if(intSum > 9){
                intSum = intSum%10;
                inMemory = true;
            }else{
                inMemory = false;
            }
            current.next = new ListNode(intSum);
            current = current.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(inMemory){
            current.next = new ListNode(1);
        }
        return nodeSum.next;
    }
}
