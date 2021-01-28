package com.example.daydayup.javatest.bean;


/**
 * Author: fushuang
 * Date: 2020/12/30 10:39 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
public class SynchronizedTest {
    public static synchronized void test1() {
        System.out.println("test1: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test1: " + Thread.currentThread().getName());
        System.out.println("test1: " + Thread.currentThread().getName());
    }

    public synchronized void test2() {
        System.out.println("test2: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2: " + Thread.currentThread().getName());
        System.out.println("test2: " + Thread.currentThread().getName());
    }
}
