package code.zjd.forClass.classTest02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/13 - 17:23
 * 给定一个整型数组arr和一个大小为w的窗口，
 * 窗口从数组最左边滑动到最右边，每次向右滑动一个位置，
 * 求出每一次滑动时窗口内最大元素的和。
 */
public class Test03 {

    public static int sumOfMaxElement(int[] arr, int box){
        if(arr.length < box) return 0;
        int l = 0;
        int r = box-1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (l <= arr.length - box){
            for (int i = l; i <= r; i++) {
                max = Math.max(max,arr[i]);
            }
            sum += max;
            max = Integer.MIN_VALUE;
            l++;
            r++;
        }
        return sum;
    }

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
            int target = Integer.valueOf(sc.nextLine());
            System.out.println(sumOfMaxElement(arr, target));
        }

    }
}
