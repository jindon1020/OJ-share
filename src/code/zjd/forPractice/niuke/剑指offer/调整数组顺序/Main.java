package code.zjd.forPractice.niuke.剑指offer.调整数组顺序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjd123
 * @date 2019/10/18 - 22:56
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {1,7,2,4,3,6};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reOrderArray(int [] array) {
        if(array.length < 2) return;
        int index = 0;
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[index++] = array[i];
            }else{
                t.add(array[i]);
            }
        }
        for (int i = index; i < array.length; i++) {
            array[i] = t.get(i - index);
        }
    }

}
