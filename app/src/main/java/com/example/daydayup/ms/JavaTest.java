package com.example.daydayup.ms;

/**
 * Author: fushuang
 * Date: 2021/1/16 2:07 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
public class JavaTest {

     static class  Parent {
        protected int a = 1;
        protected int b = 2;

        protected void change() {
            a = 2;
        }

        public Parent() {
            System.out.println("a=" + a + ",b=" + b);
            change();
        }
    }

    public static  class SubClass extends Parent {
        protected int c = 4;

        public SubClass() {
            System.out.println("a=" + a + ",b=" + b + ",c=" + c);
        }

        protected void change() {
            super.change();
            c = 3;
        }
    }


}
