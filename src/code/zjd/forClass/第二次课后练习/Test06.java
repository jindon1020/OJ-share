package code.zjd.forClass.第二次课后练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/6 - 14:23
 * 计数排序
 */
public class Test06 {

    public static void countSort(int[] array){
        int max = getMax(array);                        //获取数组的最大值，数组所有值都在0 - max之间
        int[] countArray = new int[max + 1];            //创建一个max+1大小的数组用于表示从0 - max所有数字的重复次数
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);      //用于存储排好序的数组
        for(int i = 0; i < array.length; i++){              //循环array数组
            countArray[array[i]]++;                         //因为countArray的下标代表array中的数字，而值代表array中元素的出现次数，所以countArray[array[i]]++
        }
        for(int i = 1; i < countArray.length; i++){
            countArray[i] = countArray[i] + countArray[i - 1];      //将countArray中的每一个元素变成与前一个元素相加的和
        }
        for(int i = 0; i < resultArray.length ; i++){
            array[--countArray[resultArray[i]]] = resultArray[i];                //从array的最后一位开始依次放入resultArray中，放入的位置是 --countArray[array[i]]
        }
    }

    private static int getMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                throw new RuntimeException("数组中有数小于0");
            }
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
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
        countSort(array);
        for (int i = 0; i < array.length; i++) {
            if(i == args.length-1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + " ");
        }
    }
}
