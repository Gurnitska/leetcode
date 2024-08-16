package algorithms.medium;

import algorithms.util.ListNode;

public class Merge2Lists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode result = new ListNode();

        backtrack(result, list1, list2);

        return result;
    }

    private void backtrack(ListNode result, ListNode list1, ListNode list2){
        if(list1 == null && list2 == null){
            return;
        }
        if(list1 == null && list2 != null){
            result.val = list2.val;
            result.next = new ListNode();
            if(list2.next != null) {
                backtrack(result.next, null, list2.next);
            }
        }else if(list1 != null && list2 == null){
            result.val = list1.val;
            result.next = new ListNode();
            if(list1.next != null) {
                backtrack(result.next, list1.next, null);
            }
        }else if(list1 != null && list2 != null) {
            result.next = new ListNode();
            if(list1.val > list2.val){
                result.val = list2.val;
                if(list2.next != null) {
                    backtrack(result.next, list1, list2.next);
                }else{
                    backtrack(result.next, list1, null);
                }
            }else{
                result.val = list1.val;
                if(list1.next != null) {
                    backtrack(result.next, list1.next, list2);
                }else{
                    backtrack(result.next, null, list2);
                }
            }
        }

    }
}
