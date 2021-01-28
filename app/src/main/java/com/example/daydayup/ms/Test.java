package com.example.daydayup.ms;

/**
 * Author: fushuang
 * Date: 2021/1/23 9:30 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
public class Test {

    Object lock = new Object();
    int currentIndex = 0;

    public void test() {
        new SynchronizedPrinter(0, "a66666").start();
        new SynchronizedPrinter(1, "n66666").start();
        new SynchronizedPrinter(2, "t66666").start();
    }

    public static void test111(){

    }

    public class SynchronizedPrinter extends Thread {

        private final int index;
        private final String outputChar;
        private boolean quitFlag = false;

        public void setQuitFlag(boolean quitFlag) {
            this.quitFlag = quitFlag;
        }

        public SynchronizedPrinter(int index, String outputChar) {
            this.index = index;
            this.outputChar = outputChar;
        }

        @Override
        public void run() {
            super.run();
            synchronized (lock) {
                try {
                    while (!quitFlag) {
                        if (currentIndex % 3 != index) {
                            lock.wait();
                        }
                        System.out.println(outputChar);
                        if (index != 2) {
                            currentIndex = index + 1;
                        } else {
                            currentIndex = 0;
                        }

                        lock.notifyAll();
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
