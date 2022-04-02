package main.java.oops.abstraction;

public abstract class Employee {
    private String fullName;
    private Long paymentPerHour;

    public abstract Long getPaymentPerMonth();

    public Employee() {
    }

    public Employee(String fullName, Long paymentPerHour) {
        this.fullName = fullName;
        this.paymentPerHour = paymentPerHour;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(Long paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
