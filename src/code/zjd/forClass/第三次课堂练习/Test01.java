package code.zjd.forClass.第三次课堂练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/31 - 9:32
 */
public class Test01 {

    static int maxSubStrLen(String str){
        int n = str.length();
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j+=2) {
                int length = j - i + 1;
                int leftsum = 0,rightsum = 0;
                for(int k = 0; k < length/2; k++){
                    leftsum += (str.charAt(i+k) - '0');
                    rightsum += (str.charAt(i+k+length/2) - '0');
                }
                if(leftsum == rightsum && maxlen < length){
                    maxlen = length;
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            int maxSubStrLen = maxSubStrLen(s);
            System.out.println(maxSubStrLen);
        }
    }

}
