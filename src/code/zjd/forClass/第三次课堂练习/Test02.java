package code.zjd.forClass.第三次课堂练习;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/31 - 9:54
 */
public class Test02 {

    static int ans[];

    static void countSieve(int arr[], int n){
        int MAX = arr[0];
        for (int i = 1; i < n; i++) {
            MAX = Math.max(arr[i], MAX);
        }
        int cnt[] = new int[MAX+1];
        ans = new int[MAX+1];

        for (int i = 0; i < n; ++i) {
            ++cnt[arr[i]];
        }

        for (int i = 1; i <= MAX; ++i) {
            for (int j=i; j <= MAX; j += i){
                ans[i] += cnt[j];
            }
        }
        return;
    }

    static int countMutity(int k){
        return ans[k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String numLen = sc.nextLine();
            String[] split1 = numLen.split(" ");
            int len1 = Integer.valueOf(split1[0]);
            int len2 = Integer.valueOf(split1[1]);
            String s = sc.nextLine();
            String[] split = s.split(" ");
            int[] arr = new int[split.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(split[j]);
            }
            countSieve(arr,len1);
            String line = sc.nextLine();
            String[] split2 = line.split(" ");
            int[] arrOfK = new int[split2.length];
            for (int j = 0; j < arrOfK.length; j++) {
                arrOfK[j] = Integer.valueOf(split2[j]);
            }
            int[] res = new int[len2];
            for (int j = 0; j < res.length; j++) {
                res[j] = countMutity(arrOfK[j]);
            }
            for (int j = 0; j < res.length; j++) {
                if(j == res.length-1){
                    System.out.println(res[j]);
                    break;
                }
                System.out.print(res[j]+ " ");
            }
        }
    }

}
