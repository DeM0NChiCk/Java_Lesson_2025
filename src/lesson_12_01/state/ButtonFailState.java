package lesson_12_01.state;

public class ButtonFailState extends FailState{
    public ButtonFailState(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "BUTTON DON'T JOB:" + super.getMessage();
    }
}
