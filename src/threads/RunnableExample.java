package threads;

/**
 * Thread is a lightweight process which can execute multiple codes in parallel.
 *
 * Threads can help us to do parallel processing.
 * Threads are useful when you want to run multiple pieces of code in parallel.
 */

/**
 A Thread can be created in Java in the following ways:
 1. By Extending Thread class
 2. Implementing Runnable interface
 */

//By Implementing Runnable interface
class  UploadRunnable  implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("threads.UploadRunnable--------");
        }
    }
}

class  DownloadRunnable  implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("--------threads.DownloadRunnable");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        UploadRunnable uploadRunnable=new UploadRunnable();
        Thread thread1=new Thread(uploadRunnable);
        thread1.start();

        DownloadRunnable downloadRunnable =new DownloadRunnable();
        Thread thread2=new Thread(downloadRunnable);
        thread2.start();
    }

}
