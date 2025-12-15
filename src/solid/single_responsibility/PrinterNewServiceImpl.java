package solid.single_responsibility;

public class PrinterNewServiceImpl implements PrinterService{
    @Override
    public void print(String print) {
        System.out.println("новый принтер" + print);
    }
}
