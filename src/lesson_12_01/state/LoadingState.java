package lesson_12_01.state;

public sealed class LoadingState extends State
permits OldLoading, NewLoading{
    public LoadingState(int status, String message, String content) {
        super(status, message, content);
    }

    @Override
    public String getMessage() {
        return "Loading: " + super.getMessage();
    };
}
