package com.atguigu.fanshe1;


import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取当前运行时类的属性结构
 */
public class FieldTest {

    /**
     * 获取属性结构
     *      1： getFields():获取当前运行时类及其父类中声明为public访问权限的属性
     *      2： getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
     */
    @Test
    public void test1(){
        Class clazz = Person.class;

        //1： getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println();

        //2： getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }


    /**
     * 获取：权限修饰符  数据类型 变量名
     *      1.权限修饰符，getModifiers()
     *      2.数据类型，getType()
     *      3.变量名，getName()
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            //2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            //3.变量名
            String fName = f.getName();
            System.out.print(fName);
        }
    }

}
