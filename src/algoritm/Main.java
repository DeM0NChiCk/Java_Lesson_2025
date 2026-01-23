package algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        DB<Data> dB = new DB<>("test.ru");
        API<Data> api = new API<>("test.api.ru", "load");
        CashData<Data> cashData = new CashData<>(new Data[] {
                new Data(1, "test1", 1),
                new Data(2, "test2", 2),
                new Data(3, "test2", 3),
                new Data(4, "test2", 4)
        });

        print("До db: " + Arrays.toString(dB.getData()));
        print("До api: " + Arrays.toString(api.getData()));
        print("До cash: " + Arrays.toString(cashData.getData()));

        ButtonLoading<Data> button1 = new ButtonLoading<>(new Data[] {
                new Data(1, "testBTN1", 1),
                new Data(2, "testBTN2", 2),
                new Data(3, "testBTN3", 3),
                new Data(4, "testBTN4", 4)
        });
        ButtonShow<Data> button2 = new ButtonShow<>();
        
        button1.addListener(dB);
        button1.addListener(api);

        button2.addListener(dB);
        button2.addListener(api);
        button2.addListener(cashData);

        button1.clickOn();
        button2.clickOn();

        print("После: db: " + Arrays.toString(dB.getData()));
        print("После: api: " + Arrays.toString(api.getData()));
        print("После: cash: " + Arrays.toString(cashData.getData()));
    }
}

interface Button {
    void clickOn();

}

class ButtonLoading<T> implements Button{
    private final List<Loading<T>> loadingList = new ArrayList<>();
    private T[] data;

    ButtonLoading(T[] data) {
        this.data = data;
    }

    @Override
    public void clickOn() {
        for (Loading<T> loading: loadingList) {
            loading.load(data);
        }
        System.out.println("Загрузка успешна!");
    }

    public void addListener(Loading<T> listener) {
        if (!loadingList.contains(listener))
            loadingList.add(listener);
    }
    public void removeListener(Loading<T> listener) {
        if (loadingList.contains(listener))
            loadingList.remove(listener);
    }



}

class ButtonShow<T> implements Button {
    private List<Showing<T>> showingList = new ArrayList<>();

    @Override
    public void clickOn() {
        for (Showing<T> showing: showingList) {
            showing.show();
        }
        System.out.println("Контент на экране!");
    }

    public void addListener(Showing<T> listener) {
        if (!showingList.contains(listener))
            showingList.add(listener);
    }
    public void removeListener(Showing<T> listener) {
        if (showingList.contains(listener))
            showingList.remove(listener);
    }
}

interface Loading<T>{
    void load(T[] t);
}

interface Showing<T>{
    T[] show();
}

class DB<T> implements Loading<T>, Showing<T>{
    private T[] data;
    private final String host;

    DB(String host) {
        this.host = host;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    @Override
    public T[] show() {
        return getData();
    }

    @Override
    public void load(T[] data) {
        setData(data);
    }
}

class API<T> implements Loading<T>, Showing<T>{
    private T[] data;
    private final String host;
    private String endpoint;

    API(String host, String point) {
        this.host = host;
        this.endpoint = host + point;
    }

    public void setEndpoint(String point) {
        this.endpoint = host + point;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data){
        this.data = data;
    }

    @Override
    public T[] show() {
        return getData();
    }

    @Override
    public void load(T[] data) {
        setData(data);
    }
}

class CashData<T> implements Showing<T>{
    private T[] data;

    CashData(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    @Override
    public T[] show() {
        return getData();
    }


//    public void load(Data[] data) {
//        this.data = data;
//    }
}

class Data{
    private int id;
    private String titleOrder;
    private int idOrder;

    Data(int id, String titleOrder, int idOrder) {
        this.id = id;
        this.titleOrder = titleOrder + " " + getClass();
        this.idOrder = idOrder;
    }

    public int getId() {
        return id;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public String getTitleOrder() {
        return titleOrder;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setTitleOrder(String titleOrder) {
        this.titleOrder = titleOrder;
    }

    @Override
    public String toString() {
        return "Data[id=" + getId() + ",titleOrder=" + getTitleOrder() + ",idOrder=" + getIdOrder() + "]";
    }
}
