package main.java.org.example.oop.two;

public abstract class Person {
    private String name;
    private Double annualRevenue;

    public Person(String name, Double annualRevenue) {
        this.name = name;
        this.annualRevenue = annualRevenue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualRevenue() {
        return this.annualRevenue;
    }

    public void setAnnualRevenue(Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public abstract Double calculateTaxes();

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", this.getName(), this.calculateTaxes());
    }
}
