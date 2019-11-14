package code.zjd.forClass.classTest02;

/**
 * @author zjd123
 * @date 2019/10/16 - 10:41
 * 先升后降
 * 从一列不重复的数中筛除尽可能少的数使得从左往右看，
 * 这些数是从小到大再从大到小的。
 */

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Test07 {

    static int[] a;
    static Map<String, String> map;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());//次数
        for (int i = 0; i < num; i++) {
            map = new TreeMap<String, String>();
            String[] arr=scanner.nextLine().split(" ");
            int[] a=new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                a[j]=Integer.parseInt(arr[j]);
            }
            for (int k = 0; k < a.length - 1; k++) {
                GetArrByK(a, k, 0);
                if (!map.isEmpty()) {
                    break;
                }
            }
            Set<String> entry=map.keySet();
            for (String string : entry) {
                System.out.println(string);
            }
        }
    }

    public static void GetArrByK(int[] a,int k,int l) {
        if (k==0) {
            if (isRight(a)) {       //如果数组a一直是递增或是递减的
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                    if (i == a.length - 1) {
                        sb.append(a[i]);
                    } else {
                        sb.append(a[i] + " ");
                    }
                }
                map.put(sb.toString(), " ");
            }
            return;
        }
        int[] tmp = new int[a.length - 1];
        int x = k - 1;
        for (int i = l; i < a.length; i++) {
            tmp = remove(a, i);
            GetArrByK(tmp, x, i);
        }
    }

    public static int[] remove(int[] a,int index) {
        int[] tmp = new int[a.length - 1];
        int index2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                tmp[index2++] = a[i];
            }
        }
        return tmp;
    }

    //判断是否满足增减
    public static boolean isRight(int[] a) {
        boolean isPositive=true;
        for (int i = 1; i < a.length; i++) {
            if (a[i]<a[i-1]) {      //这个只是个特殊情况，如果一开始就递减的，就把它设置为false
                isPositive=false;
            }
            if (isPositive) {       //如果一开始是递增的，但是后来又不符合了，就返回false
                if (a[i]<a[i-1]) {
                    return false;
                }
            }
            else {                  //如果一开始是递减的，但是后来又递增了，这就不符合了，就返回false
                if (a[i]>a[i-1]) {
                    return false;
                }
            }
        }
        return true;                //增减增、减增减都是返回false的，只有整个数组递增或递减才是返回true的
    }
}

