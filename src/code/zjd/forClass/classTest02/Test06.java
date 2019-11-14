package code.zjd.forClass.classTest02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/16 - 10:23
 * 输入一个数组和一个数字，在数组中查找两个数，
 * 使得它们的和正好是输入的那个数字，统计这样两个数的对数。
 */
public class Test06 {

    public static int numOfSum(int[] arr, int target){
        if(arr.length < 2) return 0;
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        int res = 0;
        while (l < arr.length && l < r && r >= 0){
            int sum = arr[l] + arr[r];
            if(sum > target){
                r--;
            }else if(sum < target){
                l++;
            }else{
                res++;
                l++;
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");
            int[] arr = new int[split.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(split[j]);
            }
            int target = Integer.valueOf(sc.nextLine());
            System.out.println(numOfSum(arr,target));
        }
    }

}
