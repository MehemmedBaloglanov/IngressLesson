package Lesson8.Praktika;

import java.util.Objects;

public abstract class Loan {
    private long ID;
    private double amount;

    public Loan() {

    }

    public Loan(long ID, double amount) {
        this.ID = ID;
        this.amount = amount;
    }

    public abstract double getCommission();

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return ID == loan.ID && Double.compare(loan.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, amount);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "ID=" + ID +
                ", amount=" + amount +
                '}';
    }
}
