package code.zjd.forClass.classTest02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/13 - 11:59
 */
public class Test01 {

    public static int rangeOfSubArr(int[] arr,int target){
        if(arr.length < 2) return 0;
        if(arr.length == 2){
            Arrays.sort(arr);
            return arr[1]-arr[0] > target ? 1 : 0;
        }
        int l = 0;
        int r = 1;
        int res = 0;
        int min = Integer.MAX_VALUE;
        int max  = Integer.MIN_VALUE;
        while (l < arr.length-1){
            for (int i = l; i <=r ; i++) {
                max = Math.max(max,arr[i]);
                min = Math.min(min,arr[i]);
            }
            if(max - min > target){
                res++;
            }
            if(r == arr.length-1){
                l++;
                r = l + 1;
                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;
            }else{
                r++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int T = Integer.valueOf(sc1.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc1.nextLine();
            String[] s1 = s.split(" ");
            int[] arr = new int[s1.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(s1[j]);
            }
            int target = Integer.valueOf(sc1.nextLine());
            System.out.println(rangeOfSubArr(arr, target));
        }

    }


}
