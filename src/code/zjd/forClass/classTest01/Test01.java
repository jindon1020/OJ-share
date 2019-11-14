package code.zjd.forClass.classTest01;


import java.util.*;

/**
 * @author zjd123
 * @date 2019/9/29 - 18:59
 * 按数值排序
 */
public class Test01 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int len1 = Integer.valueOf(s1[0]);
            int len2 = Integer.valueOf(s1[1]);
            int[] input = new int[len1];
            int[] by = new int[len2];
            for (int j = 0; j < len1; j++) {
                input[j] = Integer.valueOf(sc.next());
            }
            for (int j = 0; j < len2; j++) {
                by[j] = Integer.valueOf(sc.next());
            }
            int[] sortByNums = sortByNums(input, by);
            System.out.println(Arrays.toString(sortByNums));
        }

    }

    public static int[] sortByNums(int[] input, int[] by){
       if(input.length < 2) return input;
       int index = 0;
       int[] res = new int[input.length];
       Set<Integer> set = new HashSet<>();
        for (int i = 0; i < by.length; i++) {
            set.add(by[i]);
        }
        for (int i = 0; i < by.length; i++) {
            int curBy = by[i];
            for (int j = 0; j < input.length; j++) {
                if(input[j] == curBy){
                    res[index++] = curBy;
                }
            }
        }
        int [] singleNums = getSingleNums(input,set);
        Arrays.sort(singleNums);
        for (int i = index; i < input.length; i++) {
            res[i] = singleNums[i-index];
        }
        return res;
    }

    private static int[] getSingleNums(int[] input, Set<Integer> set) {
        int index = 0;
        int [] temp = Arrays.copyOf(input,input.length);
        for (int i = 0; i < temp.length; i++) {
            if(!set.contains(temp[i])){
                temp[index++] = temp[i];
            }
        }
        return Arrays.copyOfRange(temp,0,index);
    }
}
