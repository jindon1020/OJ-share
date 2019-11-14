package code.zjd.forClass.classTest02;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/13 - 17:57
 * 汉诺塔
 */
public class Test04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.next());
        for (int i = 0; i < T; i++) {
            int N = Integer.valueOf(sc.next());
            System.out.println(hannoi(N));
        }
    }

    public static int hannoi(int N){
        if(N == 1) return 2;
        return hannoi(N - 1) * 3 +2;
    }
}
