package code.zjd.forPractice.niuke.剑指offer.替换空格;

/**
 * @author zjd123
 * @date 2019/9/28 - 16:38
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Main {

    public static void main(String[] args) {
        String s = replaceSpace("we a re jsdi ");
        System.out.println(s);
    }

    public static String replaceSpace(String str) {
        return str.toString().replaceAll(" ","%20");
    }

}
