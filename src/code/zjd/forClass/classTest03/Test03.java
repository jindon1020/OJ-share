package code.zjd.forClass.classTest03;

import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/21 - 13:30
 * 漆狗屋房屋，里面有n块不同长度的木板[A1，A2，...，An]。
 * 他雇用了k名画家来完成这项工作，每个画家要花1个单位的时间来涂漆1个单位的板子。
 * 问题是找到在任何画家只能涂漆连续部分的约束下完成这项工作的最短时间。
 * 登上{2，3，4}或仅登上{1}或什么都没有登上{2，4，5}。
 */
public class Test03 {

    static int sum(int arr[], int from, int to){
        int total = 0;
        for (int i = from; i <= to ; i++) {
            total += arr[i];
        }
        return total;
    }

    static int parttition(int[] arr, int n, int k){
        if(k == 1)
            return sum(arr,0,n-1);
        if(n == 1)
            return arr[0];
        int best = Integer.MAX_VALUE;
        for (int i = 1; i <=n; i++) {
            best = Math.min(best,Math.max(parttition(arr,i,k-1),sum(arr,i,n-1)));
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine().trim());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int k = Integer.valueOf(s1[0]);
            int n = Integer.valueOf(s1[1]);
            String s2 = sc.nextLine();
            String[] s3 = s2.split(" ");
            int[] arr = new int[s3.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.valueOf(s3[j]);
            }
            int parttition = parttition(arr, n, k);
            System.out.println(parttition);
        }
    }

}
