package thread.main;

import thread.threads.FourthThread;
import thread.threads.GetThread;
import thread.threads.PutThread;
import thread.threads.ThirdThread;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<String>();
        new Thread(new PutThread(ex)).start();
        new Thread(new ThirdThread(ex)).start();
        new Thread(new GetThread(ex)).start();
        new Thread(new FourthThread(ex)).start();
    }
}
