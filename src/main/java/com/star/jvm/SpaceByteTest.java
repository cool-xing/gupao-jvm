package com.star.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：SpaceByteTest
 * @Description：TODO
 * @Author：msx
 * @Date：2019/9/24 13:48
 * @Version 1.0
 */
public class SpaceByteTest {


    public static void main(String[] args) {
        byte[] bytes = new byte[200*1024*1024];
        int i = 10;
        int m = i++;
        int n = ++i;
        while(i>=0){
            i--;
            //System.out.println(i--);
        }
        List<String> newString = new ArrayList<String>();
        int result = getResult();
        System.out.println(result);
     }

     public static  int getResult(){
        int ss =10;
        try{
            ss = 10+20;
            return ss;//30
        }catch (Exception e){
            //eclipse try catch
            e.printStackTrace();
        }finally {
            ss = 20;
//            return ss;//20
        }
         return ss;//20
     }
}
