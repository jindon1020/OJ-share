package code.zjd.forPractice.niuke.剑指offer.二进制中的1个数;

/**
 * @author zjd123
 * @date 2019/10/5 - 18:45
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 1100 -->12
 * 1011 -->11
 * 1100
 * &
 * 1011
 * ----
 * 1000
 */
public class Main {

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        int numberOf1 = NumberOf1(-10);
        System.out.println(numberOf1);
    }

}
