package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main method");

        Thread at1 = new AnotherThread();
        at1.start();

        new Thread(){
            public void run(){
                System.out.println("Hello from anonymous block");
            }
        }.start();

        Thread myRunnableThread = new Thread(new myRunnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class implementation of run()\n");
            }
        });
        myRunnableThread.start();


        System.out.println("Hello again from the main method");
    }
}
