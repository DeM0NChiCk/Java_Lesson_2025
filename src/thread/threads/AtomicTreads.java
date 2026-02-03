package thread.threads;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class AtomicTreads {

    public static void main(String[] args) throws InterruptedException{

        int numThreads = 100000;
        int incrementsPerThread = 100000;

        Counter counter = new Counter();

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++){

            threads[i] = new Thread(() ->{

                for (int j = 0; j < incrementsPerThread; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }
        // небольшая задержка, чтобы потоки успели поработать
        Thread.sleep(1000);

        // ожидаем завершения всех потоков
        for (int i = 0; i < numThreads; i++){
            threads[i].join();
        }

        // проверяем значение счетчика
        System.out.println("Counter: " + counter.getCounter());
    }
}

class Counter{
    // Правильный, потокобезопасный счетчик
    private LongAdder counter = new LongAdder();

    long getCounter() { return counter.longValue(); }
    void increment() { counter.increment();  }   //  АТОМАРНАЯ ОПЕРАЦИЯ!
}
