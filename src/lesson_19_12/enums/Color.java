package lesson_19_12.enums;

public enum Color {
    Black("#000000") {
        @Override
        public String getColorName() {
            return "Black";
        }
    },
    White("#FFFFFF") {
        @Override
        public String getColorName() {
            return "";
        }
    },
    RED("#FF0000") {
        @Override
        public String getColorName() {
            return "";
        }
    },
    BLUE("#0000FF") {
        @Override
        public String getColorName() {
            return "";
        }
    },
    GREEN("#00FF00") {
        @Override
        public String getColorName() {
            return "";
        }
    };

    private final String code;
    Color (String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public abstract String getColorName();
}
