package lesson_12_01.state;

public non-sealed class FailState extends State {

    public FailState(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "Fail: " + super.getMessage();
    };
}
