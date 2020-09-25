class T implements Runnable {
    public void run() {
        System.out.println("T is running");
    }
}

class T1 implements Runnable {
    public void run() {
        System.out.println("T1 is running");
    }
}

class byRunnable {
    public static void main(String[] args) {
        T p = new T();
        T1 p1 = new T1();
        Thread t3 = new Thread(p1);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t4 = new Thread(p);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}