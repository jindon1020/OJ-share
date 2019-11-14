package code.zjd.forClass.第三次课堂练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/31 - 10:24
 */
public class Test04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = Integer.valueOf(sc.nextLine());
            for (int i = 0; i < T; i++) {
                String str = sc.nextLine();
                String[] split = str.split(",");
                search(split[0],split[1]);
                System.out.println();
            }
        }

        static void search(String txt,String pat){
            List<Integer> res = new ArrayList<>();
            int M = pat.length();
            int N = txt.length();

            for (int i = 0; i <= N - M; i++) {
                int j ;
                for (j = 0; j < M; j++) {
                    if(txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if(j == M){
                    res.add(i);
                }
            }
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i));
                if(i < res.size() - 1){
                    System.out.print(" ");
                }
            }
        }

}
