package code.zjd.forPractice.niuke.剑指offer.变态跳台阶;

import java.util.Arrays;

/**
 * @author zjd123
 * @date 2019/9/30 - 21:54
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Main {

    public static int JumpFloorII(int target) {
        if(target <= 2)return target;
        int res[] = new int[target+1];
        Arrays.fill(res,1);
        res[0] = 0;
        for (int i = 2; i <=target ; i++) {
                for (int j = i; j >=1 ; j--) {
                res[i] += res[j-1];
            }
        }
        return res[target];
    }

    public static void main(String[] args) {
        int i = JumpFloorII(6);
        System.out.println(i);
    }
}
