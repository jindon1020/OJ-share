package code.zjd.forPractice.niuke.剑指offer.矩形覆盖;

import java.util.Arrays;

/**
 * @author zjd123
 * @date 2019/10/5 - 18:08
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 */
public class Main {

    public static int RectCover(int target) {
        if(target <= 2) return target;
        return RectCover(target-1)+RectCover(target-2);
    }

    public static void main(String[] args) {
        int i = RectCover(4);
        System.out.println(i);
    }
}
