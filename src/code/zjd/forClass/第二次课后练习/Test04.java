package code.zjd.forClass.第二次课后练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/5 - 17:09
 * 实现插入排序。
 */
public class Test04 {

    static int[] insertSort(int[] array){
        if(array.length <= 1) return array;
        int preIndex;
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i+1];
            preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String nextLine = sc.nextLine();
            String[] split = nextLine.split(" ");
            int[] array = new int[Integer.valueOf(split[0])];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.valueOf(split[j+1]);
            }
            int[] insertSort = insertSort(array);
            for (int j = 0; j < insertSort.length; j++) {
                if(j == insertSort.length-1){
                    System.out.println(insertSort[j]);
                    break;
                }
                System.out.print(insertSort[j] + " ");
            }
        }
    }
}
