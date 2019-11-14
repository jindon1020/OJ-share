package code.zjd.forClass.第三次课堂练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/31 - 11:16
 */
public class Test05 {

    //    static int calcuateNum(int year){
    //        if(year == 1 || year == 2) return year;
    //        int pre = 1;
    //        int mid = 2;
    //        int res = 0;
    //        for (int i = 0; i < year-2; i++) {
    //            res = pre + mid;
    //            pre = mid;
    //            mid = res;
    //        }
    //        return res;
    //    }
    //
    //    public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        int T = Integer.valueOf(sc.nextLine());
    //        for (int i = 0; i < T; i++) {
    //            int year = Integer.valueOf(sc.nextLine());
    //            int calcuateNum = calcuateNum(year);
    //            System.out.println(calcuateNum);
    //        }
    //    }

        static Map<Long,Long> map=new HashMap<Long,Long>();
        public static long fib(long n)
        {
            if(n==0)
                return 0;
            if(n==2 || n==1)
                return 1;
            if(map.containsKey(n))
                return map.get(n);
            if(n%2!=0)
            {
                long k=(n+1)/2;
                map.put(n,(fib(k)*fib(k)+fib(k-1)*fib(k-1))%1000000007);
            }
            else{
                long k=n/2;
                map.put(n,(fib(k)*((fib(k-1)<<1)+fib(k)))%1000000007);

            }
            return map.get(n);
        }
        public static void main (String[] args)
        {
            Scanner ab=new Scanner(System.in);
            int t=ab.nextInt();
            while(t-->0)
            {
                System.out.println(fib(ab.nextLong()+1));
            }
        }

    }


