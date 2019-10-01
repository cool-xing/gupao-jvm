package com.star.jvm;

import com.oracle.jrockit.jfr.Producer;

import java.util.function.Consumer;

public class StaticTest {
    //执行结果为：2   3   a=100 b=0   1   4
    //步骤8.最后执行main方法
    public static void main(String[] args) {
        staticFunction();
        //StaticTest st = new StaticTest();
    }
    //静态变量,步骤5.赋值，
    static StaticTest st = new StaticTest();
    //步骤1.有构造器的时候，最先执行了，普通代码块，其实这里最先执行应该是上面那句代码的原因
    //因为当注释掉上面的部分，下面的代码将在调用构造函数之前去调用，
    { System.out.println("2"); }
    //静态代码块，步骤6.接下来执行静态代码块
    static {System.out.println("1"); }
    //构造函数
    public StaticTest() {
        //步骤3，调用普通代码块，
        System.out.println("3");
        //步骤4，调用构造函数
        System.out.println("a=" + a + " b=" + b);
    }
    //方法，步骤9
    private static void staticFunction() { System.out.println("4"); }
    //步骤2，在构造函数之前就被调用了
    int a = 100;
    //步骤7，在静态代码块执行之后才调用的，难道不是先吗？奇怪啊
    static int b = 112;

}