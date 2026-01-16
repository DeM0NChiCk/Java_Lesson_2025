package lesson_12_01.state;

public sealed class State permits FailState, SuccessState, CreateState, LoadingState {
    private final int status;
    private final String message;
    private final String content;

    public State(int status, String message, String content) {
        this.status = status;
        this.message = message;
        this.content = content;
    }

    public void getState() {
        System.out.printf("State=[status=%s,message=%s,content=%s]\n", status, getMessage(), content);
    }

    public String getMessage() {
        return message;
    };
}
