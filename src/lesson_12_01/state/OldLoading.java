package lesson_12_01.state;

public final class OldLoading extends LoadingState{
    public OldLoading(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "OLD LOADING: " + super.getMessage();
    }
}
