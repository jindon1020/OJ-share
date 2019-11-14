package code.zjd.forPractice.niuke.剑指offer.链表中倒数第K节点;

/**
 * @author zjd123
 * @date 2019/10/22 - 11:15
 */
public class Solution {

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return null;
        if(head.next == null && k == 1) return head;
        int size = 1;
        ListNode t = head;
        while (t.next != null){
            t = t.next;
            size++;
        }
        if(k > size) return null;
        for (int i = 0; i < size-k; i++) {
            head = head.next;
        }
        return head;
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
        System.out.println(FindKthToTail(h1,3).val);
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}