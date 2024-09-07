package Lesson7;

import java.util.Objects;

public abstract class Customer implements DiscountService{
    private long id;
    private String name;
    private Loan loan;

    public Customer(long id, String name, Loan loan) {
        this.id = id;
        this.name = name;
        this.loan = loan;
    }


    public Customer() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(loan, customer.loan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, loan);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loan=" + loan +
                '}';
    }
}
