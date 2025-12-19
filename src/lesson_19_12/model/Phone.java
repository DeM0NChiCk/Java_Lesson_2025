package lesson_19_12.model;


public class Phone {
    private final String numberPhone;

    public Phone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Phone)) return false;

        return this.numberPhone.equals(((Phone) obj).numberPhone);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
