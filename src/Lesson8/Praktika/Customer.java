package Lesson8.Praktika;

import java.util.Objects;

public abstract class Customer implements DiscountService {
    private int ID;
    private String name;
    private Loan loan;

    public Customer() {

    }

    public Customer(int ID, String name, Loan loan) {
        this.ID = ID;
        this.name = name;
        this.loan = loan;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return ID == customer.ID && Objects.equals(name, customer.name) && Objects.equals(loan, customer.loan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, loan);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", loan=" + loan +
                '}';
    }
}
