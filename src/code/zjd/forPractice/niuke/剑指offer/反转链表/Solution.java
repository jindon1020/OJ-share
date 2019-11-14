package code.zjd.forPractice.niuke.剑指offer.反转链表;

/**
 * @author zjd123
 * @date 2019/10/22 - 11:32
 */
public class Solution {

    private static ListNode ReverseList(ListNode head) {
       if(head == null || head.next == null){
           return head;
       }
       ListNode pre = null;
       ListNode next ;
       while (head != null){
           next = head.next;
           head.next = pre;
           pre = head;
           head = next;
       }
       return pre;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(3);
        ListNode h2 = new ListNode(7);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(2);
        ListNode h5 = new ListNode(1);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        ListNode listNode = ReverseList(h1);
        while (listNode.next != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}