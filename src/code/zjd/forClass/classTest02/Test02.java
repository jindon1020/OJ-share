package code.zjd.forClass.classTest02;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/13 - 15:54
 * 子矩阵问题
 * 给定一个矩形区域，每一个位置上都是1或0，
 * 求该矩阵中每一个位置上都是1的最大子矩形区域中的1的个数。
 */
public class Test02 {

    public static int lenOfMaxMatrix(int[][] m){
        if(m.length == 1) {
            boolean flag = true;
            for (int i = 0; i < m[0].length; i++) {
                if(m[0][i] != 1){
                    flag = false;
                }
            }
            return flag ? m[0].length : 1;
        }
        int l_row = 0;
        int l_col = 0;
        int r_row = 1;
        int r_col = 1;
        int maxLen = 0;
        while (l_row < m.length-1){
            while (l_col < m[0].length-1){
                int tempLen = 0;
                outerLoop: for (int i = l_row; i <= r_row; i++) {
                    for (int j = l_col; j <= r_col; j++) {
                        if(m[i][j] == 1){
                            tempLen++;
                        }else{
                            tempLen = 0;
                            break outerLoop;
                        }
                    }
                }
                maxLen = Math.max(maxLen,tempLen);
                if(r_col == m[0].length-1){
                    if(r_row == m.length-1){
                        l_col++;
                        r_row = l_row + 1;
                        r_col = l_col + 1;
                    }else{
                        r_row++;
                        r_col = l_col + 1;
                    }
                }else{
                    r_col++;
                }
            }
            l_row++;
            l_col = 0;
            r_row = l_row + 1;
            r_col = 1;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.next());
        for (int i = 0; i < T; i++) {
            int rows = Integer.valueOf(sc.next());
            int cols = Integer.valueOf(sc.next());
            int[][] m = new int[rows][cols];
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    m[j][k] = Integer.valueOf(sc.next());
                }
            }
            System.out.println(lenOfMaxMatrix(m));
        }
    }
}
