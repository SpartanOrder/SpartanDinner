package com.spartan.util;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/4/5 11:44
 */
public class EnoughNumber {
    public static void main(String[] args) {
        EnoughNumber enoughNumber = new EnoughNumber();
        System.out.println(enoughNumber.lpad(10, 23));
    }

    /**
     * 补齐不足长度
     * @param length 长度
     * @param number 数字
     * @return
     */
    public static String lpad(int length, int number) {
        String f = "%0" + length + "d";
        return String.format(f, number);
    }
}
