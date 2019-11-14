package code.zjd.forPractice.niuke.剑指offer.数值的整数次方;

import java.text.DecimalFormat;

/**
 * @author zjd123
 * @date 2019/10/6 - 20:01
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Main {

    public static void main(String[] args) {
        double power = Power(2, -3);
        System.out.println(power);
    }

    public static double Power(double base, int exponent) {
        if(base == 0) return 0;
        double res = 1.0;
        int e = exponent>0 ? exponent : -exponent;
        for (int i = 0; i < e; i++) {
            res *= base;
        }
        return exponent > 0 ? res : 1/res;
    }

}
