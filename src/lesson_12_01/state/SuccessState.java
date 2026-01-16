package lesson_12_01.state;

public final class SuccessState extends State{
    public SuccessState(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "Success: " + super.getMessage();
    };
}
