package code.zjd.forClass.第二次课后练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/5 - 17:44
 * 冒泡排序
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String nextLine = sc.nextLine();
            String[] split = nextLine.split(" ");
            int[] array = new int[Integer.valueOf(split[0])];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.valueOf(split[j+1]);
            }
            int[] insertSort = bubbleSort(array);
            for (int j = 0; j < insertSort.length; j++) {
                if(j == insertSort.length-1){
                    System.out.println(insertSort[j]);
                    break;
                }
                System.out.print(insertSort[j] + " ");
            }
    }

    static int[] bubbleSort(int[] array){
        if(array.length == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
