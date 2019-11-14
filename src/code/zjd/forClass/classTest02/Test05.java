package code.zjd.forClass.classTest02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/13 - 18:37
 * 找到给定数组的给定区间内的第K小的数值。
 */
public class Test05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int[] arr = new int[s1.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(s1[j]);
            }
            String ss = sc.nextLine();
            String[] s2 = ss.split(" ");
            int left = Integer.valueOf(s2[0]);
            int right = Integer.valueOf(s2[1]);
            int k = Integer.valueOf(sc.nextLine());
            System.out.println(valueOfK(arr, left, right, k));
        }

    }

    public static int valueOfK(int[] arr, int left, int right, int k){
        if(arr.length < 2 || left > right || k > (right-left)) return 0;
        if(left == right) return arr[left-1];
        int[] subArr = Arrays.copyOfRange(arr,left-1,right);
        Arrays.sort(subArr);
        return subArr[k-1];
    }

}
