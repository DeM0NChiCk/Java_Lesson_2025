package solid.single_responsibility;

public class PrinterServiceImpl implements PrinterService {
    @Override
    public void print(String print) {
        System.out.println(print);
    }
}
