package com.functioninterface;

import java.util.function.Function;

/*
函数型接口

Function<T,R>  传入参数T 返回类型R
有输入参数，有返回值
可以用lambda表达式简化
 */
public class FunctionTest {
    public static void main(String[] args) {
//        匿名内部类
//        Function fun = new Function<String,String>(){
//            @Override
//            public String apply(String o) {
//                return o;
//            }
//        };

        Function<String,String> fun = (str)->{
            return str;
        };
        System.out.println(fun.apply("asd"));
    }
}
