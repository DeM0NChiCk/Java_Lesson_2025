package lesson_12_01.state;

public final class CreateState extends State {
    public CreateState(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "Create: " + super.getMessage();
    };
}
