package code.zjd.forClass.classTest04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/10/17 - 18:45
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int groupCount = sc.nextInt();
        int queryCount = sc.nextInt();
        while(groupCount>0){
            int startGroup = sc.nextInt();
            int endGroup = sc.nextInt();
            for(int i=startGroup;i<=endGroup;i++){
                arr.add(i);
            }
            groupCount--;
        }
        while(queryCount>0){
            int startingJumpPoint= arr.get(0);
            int rank = sc.nextInt();
            System.out.print(arr.get(rank-startingJumpPoint)+ " ");
            queryCount--;
        }
    }

}
