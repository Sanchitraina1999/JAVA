class T2 extends Thread {
    public void run() {
        System.out.println("Thread T2 is running");
    }
}

class T3 extends Thread {
    public void run() {
        System.out.println("Thread T3 is running");
    }
}

class byThread {
    public static void main(final String[] args) {
        final T2 p = new T2();
        final T2 p1 = new T2();
        final T3 p2 = new T3();
        p.start();
        p1.start();
        p2.start();
    }
}