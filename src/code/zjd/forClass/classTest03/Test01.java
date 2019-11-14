package code.zjd.forClass.classTest03;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/17 - 11:34
 */
public class Test01 {

    public static int getModNumber(int[] input){
        int a = input[0];
        int b = input[1];
        int c = input[2];

        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger(String.valueOf(a));
        for (int i = 0; i < b; i++) {
            b1 = b1.multiply(b2);
        }
        return b1.mod(new BigInteger(String.valueOf(c))).intValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            int[] arr = new int[s.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(s[j]);
            }
            System.out.println(getModNumber(arr));
        }
    }

}
