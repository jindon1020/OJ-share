package code.zjd.forPractice.niuke.剑指offer.从头到尾打印链表;

import java.util.ArrayList;

/**
 * @author zjd123
 * @date 2019/9/28 - 16:41
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Main {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ArrayList<Integer> integers = printListFromTailToHead(node1);
        System.out.println(integers);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        long l = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null){
            list.add(0,tmp.val);
            tmp = tmp.next;
        }
        return list;
    }
}


class ListNode {
   int val;
   ListNode next = null;
   ListNode(int val) {
     this.val = val;
   }
 }