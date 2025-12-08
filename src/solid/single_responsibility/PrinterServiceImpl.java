package solid.single_responsibility;

class PrinterServiceImpl implements PrinterService {
    @Override
    public void print(String print) {
        System.out.println(print);
    }
}
