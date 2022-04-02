package main.java.oops.abstraction;

public class FullTimeEmployee extends Employee{
    private Long workingHours;

    @Override
    public Long getPaymentPerMonth() {
        return getPaymentPerHour() * workingHours;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String fullName, Long paymentPerHour) {
        super(fullName, paymentPerHour);
    }

    public FullTimeEmployee(Long workingHours) {
        this.workingHours = workingHours;
    }

    public FullTimeEmployee(String fullName, Long paymentPerHour, Long workingHours) {
        super(fullName, paymentPerHour);
        this.workingHours = workingHours;
    }

    public Long getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Long workingHours) {
        this.workingHours = workingHours;
    }
}
