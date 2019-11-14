package code.zjd.forClass.第二次课后练习;


import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/5 - 14:56
 *
 */
public class Test03 {

    static void printReverseByK(ListNode head, int k){
        ListNode headReplace = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (headReplace != null){
            stringBuilder.append(headReplace.val);
            headReplace = headReplace.next;
        }
        if(stringBuilder.length() == 1){
            System.out.println(stringBuilder.toString());
            return;
        }
        if(stringBuilder.length() == k){
            print(stringBuilder);
            System.out.println();
            return;
        }
        String string = stringBuilder.toString();
        int l = 0;
        int r = l + k -1 ;
        while (l < r && r < string.length()){
            StringBuilder temp = new StringBuilder();
            for (int i = l; i <= r; i++) {
                temp.append(string.charAt(i));
            }
            print(temp);
            l += k;
            r += k;
        }
        for (int i = l; i < string.length(); i++) {
            if(i == string.length()-1){
                System.out.println(string.charAt(i));
                return;
            }
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    }

    static void print(StringBuilder stringBuilder){
        String reverse = stringBuilder.reverse().toString();
        for (int i = 0; i < reverse.length(); i++) {
            System.out.print(reverse.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String nextLine = sc.nextLine();
            String[] split = nextLine.split(" ");
            ListNode head = new ListNode(split[1]);
            ListNode headReplace = head;
            for (int j = 2; j < Integer.valueOf(split[0])+1; j++) {
                ListNode t = new ListNode(split[j]);
                headReplace.next = t;
                headReplace = headReplace.next;
            }
            int k = Integer.valueOf(split[split.length - 1]);
            printReverseByK(head, k);
        }
    }
}


//public class Main {
//    private static int T;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        T = in.nextInt();
//        in.nextLine();
//        while (T-- != 0) {
//            String s = in.nextLine();
//            String[] dataStr = s.split(" ");
//
//            int n = Integer.valueOf(dataStr[0]);
//            if (n == 0){
//                print();
//                continue;
//            }
//            int spaceCnt = n-1;
//            String[] strings = new String[n];
//            for (int i = 0; i < n; i++) {
//                strings[i] = dataStr[i+1];
//            }
//            int k = Integer.parseInt(dataStr[dataStr.length-1]);
//            if (k == 0){
//                for (int i = 0; i < n; i++) {
//                    System.out.print(strings[i]);
//                    if (spaceCnt-- != 0){
//                        System.out.print(" ");
//                    }
//                }
//                print();
//                continue ;
//            }
//            if (k > n){
//                for (int i = 0; i < n; i++) {
//                    System.out.print(strings[i]);
//                    if (spaceCnt-- != 0){
//                        System.out.print(" ");
//                    }
//                }
//                print();
//                continue ;
//            }
//            int point = -1;
//            while (point + k < n){
//                for (int i = 0; i < k; i++) {
//                    System.out.print(strings[point + k - i]);
//                    if (spaceCnt-- != 0){
//                        System.out.print(" ");
//                    }
//                }
//                point += k;
//            }
//            if (point < n){
//                for (int i = point + 1; i < n; i++) {
//                    System.out.print(strings[i]);
//                    if (spaceCnt-- != 0){
//                        System.out.print(" ");
//                    }
//                }
//            }
//            print();
//        }
//    }
//
//
//    private static void print(){
//        if (T == 0){
//            System.out.println();
//        }else{
//            System.out.println();
//        }
//    }
//}