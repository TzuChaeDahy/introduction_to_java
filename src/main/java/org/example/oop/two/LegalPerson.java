package main.java.org.example.oop.two;

public class LegalPerson extends Person {
    private Integer numberOfEmployees;

    public LegalPerson(String name, Double annualRevenue, Integer numberOfEmployees) {
        super(name, annualRevenue);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double calculateTaxes() {
        float tax = 0.0f;
        if (getNumberOfEmployees() > 10) {
            tax = 14/100f;
        } else {
            tax = 16/100f;
        }

        return super.getAnnualRevenue() * tax;
    }
}
