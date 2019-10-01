package com.star.jvm;

/**
 * @ClassName：RuntimeTest
 * @Description：TODO
 * @Author：msx
 * @Date：2019/9/24 11:17
 * @Version 1.0
 */
public class RuntimeTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        String dd = "";
    }
}
