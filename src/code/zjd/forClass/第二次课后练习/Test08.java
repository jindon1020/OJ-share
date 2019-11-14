package code.zjd.forClass.第二次课后练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjd123
 * @date 2019/11/9 - 18:20
 * 非递归合并排序
 */
public class Test08 {

     static int[] mergeSort(int []array){
        if(array.length < 2) return array;
        int mid = array.length/2;
        int [] left = Arrays.copyOfRange(array,0,mid);
        int [] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));

    }

     static int[] merge(int[] left, int[] right) {
        int [] res = new int[left.length+right.length];
        for(int index = 0;index < res.length;index++){
            int i = 0, j = 0;
            if(i >= left.length){   //当left先遍历完，直接添加right
                res[index] = right[j++];
            }else if(j >= right.length){
                res[index] = left[i++];
            }else if(left[i] > right[j]){
                res[index] = right[j++];
            }else{
                res[index] = left[i++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int num = Integer.valueOf(split[0]);
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(split[i+1]);
        }
        int[] mergeSort = mergeSort(array);
        for (int i = 0; i < mergeSort.length; i++) {
            if(i == args.length-1){
                System.out.println(mergeSort[i]);
                break;
            }
            System.out.print(mergeSort[i] + " ");
        }
    }
}
