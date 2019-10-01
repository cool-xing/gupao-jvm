package com.star.jvm;

/**
 * @ClassName：SyschronizedTest
 * @Description：TODO
 * @Author：msx
 * @Date：2019/9/25 15:40
 * @Version 1.0
 */
public class SyschronizedTest {

    static {
        i=10;
        //System.out.println(i);
    }

    public static void main(String[] args) {
        synchronized (SyschronizedTest.class){

        }
    }

    static int i = 1;

}
