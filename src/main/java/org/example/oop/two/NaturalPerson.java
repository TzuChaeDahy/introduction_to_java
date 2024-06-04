package main.java.org.example.oop.two;

public class NaturalPerson extends Person {
    private Double healthSpends;

    public NaturalPerson(String name, Double annualRevenue, Double healthSpends) {
        super(name, annualRevenue);
        this.healthSpends = healthSpends;
    }

    public Double getHealthSpends() {
        return healthSpends;
    }

    public void setHealthSpends(Double healthSpends) {
        this.healthSpends = healthSpends;
    }

    @Override
    public Double calculateTaxes() {
        float tax = 0.0f;
        if (super.getAnnualRevenue() < 20000.0){
            tax = 15/100f;
        } else {
            tax = 25/100f;
        }

        return super.getAnnualRevenue() * tax - this.getHealthSpends() * 0.5;
    }
}
