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

//By Extending Thread class
class  UploadThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("threads.UploadThread--------");
        }
    }
}

class  DownloadThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("--------threads.DownloadThread");
        }
    }
}

public class ThreadExample{
    public static void main(String[] args) {
        UploadThread uploadThread=new UploadThread();
        uploadThread.start();

        DownloadThread downloadThread=new DownloadThread();
        downloadThread.start();

    }
}
