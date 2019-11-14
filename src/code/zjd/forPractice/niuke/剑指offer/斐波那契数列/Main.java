package code.zjd.forPractice.niuke.剑指offer.斐波那契数列;

/**
 * @author zjd123
 * @date 2019/9/30 - 21:40
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Main {

    public static int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 ) return 1;

        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        int fibonacci = Fibonacci(5);
        System.out.println(fibonacci);
    }

}
