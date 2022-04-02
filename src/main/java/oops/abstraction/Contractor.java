package main.java.oops.abstraction;

public class Contractor extends Employee{
    private Long workingHours;

    @Override
    public Long getPaymentPerMonth() {
        return getPaymentPerHour() * workingHours;
    }

    public Contractor(Long workingHours) {
        this.workingHours = workingHours;
    }

    public Contractor(String fullName, Long paymentPerHour, Long workingHours) {
        super(fullName, paymentPerHour);
        this.workingHours = workingHours;
    }

    public Contractor() {
    }

    public Contractor(String fullName, Long paymentPerHour) {
        super(fullName, paymentPerHour);
    }

    public Long getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Long workingHours) {
        this.workingHours = workingHours;
    }
}
