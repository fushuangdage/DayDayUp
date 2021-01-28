package com.example.daydayup;

import android.util.Log;

import com.example.daydayup.javatest.bean.SynchronizedTest;
import com.example.daydayup.ms.JavaTest;

import org.junit.Test;

/**
 * Author: fushuang
 * Date: 2020/12/1 8:18 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
public class ETest {
    @Test
    public void doThread() throws InterruptedException {
        try {
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int a = 1 / 0;
                }
            }.start();
        }catch (Exception e){
            System.out.println("fs666");
            e.printStackTrace();
        }
        Thread.sleep(10000);
    }
    @Test
    public void test1( ){
    }


    @Test
    public void test2() {

        final SynchronizedTest synchronizedTest = new SynchronizedTest();

        final Thread t1=new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("aaa  ");
                synchronizedTest.test1();
            }
        };
        t1.start();

        Thread t2=new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("aaab start");
                synchronizedTest.test2();
            }
        };
        t2.start();


        try {
//            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

    @Test
    public void test3(){
        JavaTest.SubClass subClass = new JavaTest.SubClass();

    }



}
