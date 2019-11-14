package code.zjd.forClass.第二次课后练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/5 - 14:26
 * 判断一个单向链表是否为回文结构。自定义链表数据结构，要求时间复杂度为O(n)，额外空间复杂度为O(1)。
 */
public class Test02 {

    static boolean checkSame(ListNode head){
        if(head != null && head.next == null) return true;
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null){
            stringBuilder.append(head.val);
            head = head.next;
        }
        String toString = stringBuilder.toString();
        StringBuilder reverse = stringBuilder.reverse();
        if(toString.equals(reverse.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String nextLine = sc.nextLine();
            String[] split = nextLine.split(" ");
            ListNode head = new ListNode(split[1]);
            ListNode headReplace = head;
            for (int j = 2; j < split.length; j++) {
                ListNode t = new ListNode(split[j]);
                headReplace.next = t;
                headReplace = headReplace.next;
            }
            boolean res = checkSame(head);
            System.out.println(res);
        }
    }

}

class ListNode{
    String val;
    ListNode next;
     public ListNode(String val){
         this.val = val;
    }
}
