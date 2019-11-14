package code.zjd.forPractice.niuke.剑指offer.二维数组的查找;

/**
 * @author zjd123
 * @date 2019/9/28 - 15:27
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {

    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {4,6,7,8},
                {5,7,8,9}
        };
       boolean res =  Find(9,array);
        System.out.println(res);
    }

    public static boolean Find(int target, int [][] array) {
        if(array.length == 0 || array[0].length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            if(target <= array[i][array[0].length-1] && target >= array[i][0]){
                for (int j = 0; j < array[i].length; j++) {
                    if(target == array[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
