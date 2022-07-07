package com.imooc.miaosha.test;



/**
 * @author ICDM_王顺
 * @Classname MyRunnable
 * @Description TODO
 * @Date 2022/6/27 19:22
 * @Created by TheKing_Shun
 */

public class MyRunnable implements Runnable {
    private int number = 1;
    @lombok.SneakyThrows
    @Override
    public void run() {
        while(true){
            synchronized(this){
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    wait();
                }else break;
            }
        }
    }

    static class Main {
        public static void main(String[] args) {
            MyRunnable myRunnable = new MyRunnable();
            Thread t1 = new Thread(myRunnable);
            Thread t2 = new Thread(myRunnable);
            t1.start();
            t2.start();
        }
    }
}

