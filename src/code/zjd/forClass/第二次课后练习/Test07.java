package code.zjd.forClass.第二次课后练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/8 - 18:17
 * 非递归快速排序
 */
public class Test07 {

     static void sort(int[] array, int l, int r) {
        if(l > r){
            return;
        }
        int base = array[l];    //基准选择数组最左
        int i = l,j = r;
        while (i != j){
            while (array[j] >= base && i < j){
                j--;
            }
            while (array[i] <= base && i < j){
                i++;
            }
            if(i < j){
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[l] = array[i];
        array[i] = base;
        sort(array,l,i-1);
        sort(array,i+1,r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int num = Integer.valueOf(split[0]);
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(split[i+1]);
        }
        sort(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            if(i == args.length-1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + " ");
        }
    }

}
