package lesson_12_01.state;

public final class NewLoading extends LoadingState{
    public NewLoading(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "NEW LOADING: " + super.getMessage();
    }
}
