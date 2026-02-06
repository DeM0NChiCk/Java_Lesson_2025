package thread.threads;

public class ExVirtualThread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");

        Runnable task = () -> {
            System.out.println("Hello from a virtual thread");
        };

        var t1 = Thread.startVirtualThread(task); // запускаем виртуальный поток
        var t2 = Thread.startVirtualThread(task);
        var t3 = Thread.startVirtualThread(task);
        var t4 = Thread.startVirtualThread(task);


        try{
            t1.join();       // ждем завершения виртуального потока
            t2.join();
            t3.join();
        }
        catch(InterruptedException _){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished...");
    }
}
