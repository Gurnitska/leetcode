package algorithms.medium;


import algorithms.util.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    @Test
    public void test1(){
        ListNode l11 = new ListNode(9, null);
        ListNode l12 = new ListNode(9, l11);
        ListNode l13 = new ListNode(9, l12);
        ListNode l14 = new ListNode(9, l13);
        ListNode l15 = new ListNode(9, l14);
        ListNode l16 = new ListNode(9, l15);
        ListNode l17 = new ListNode(9, l16);

        ListNode l21 = new ListNode(9, null);
        ListNode l22 = new ListNode(9, l21);
        ListNode l23 = new ListNode(9, l22);
        ListNode l24 = new ListNode(9, l23);


        ListNode l31 = new ListNode(1, null);
        ListNode l32 = new ListNode(0, l31);
        ListNode l33 = new ListNode(0, l32);
        ListNode l34 = new ListNode(0, l33);
        ListNode l35 = new ListNode(9, l34);
        ListNode l36 = new ListNode(9, l35);
        ListNode l37 = new ListNode(9, l36);
        ListNode l38 = new ListNode(8, l37);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l17, l24);

    }

    @Test
    public void test2(){
        ListNode l11 = new ListNode(3, null);
        ListNode l12 = new ListNode(4, l11);
        ListNode l13 = new ListNode(2, l12);

        ListNode l21 = new ListNode(4, null);
        ListNode l22 = new ListNode(6, l21);
        ListNode l23 = new ListNode(5, l22);



//        ListNode l31 = new ListNode(1, null);
//        ListNode l32 = new ListNode(0, l31);
//        ListNode l33 = new ListNode(0, l32);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l13, l23);

    }
}
