package code.zjd.forPractice.niuke.剑指offer.跳台阶;

/**
 * @author zjd123
 * @date 2019/9/30 - 21:47
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Main {

    public int JumpFloor(int target) {
        if(target <= 2) return target;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

}
