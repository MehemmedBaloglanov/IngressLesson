package Lesson18;

import java.util.Objects;

public class Car1 {
    private String carNumber;
    private int year;

    public Car1(String carNumber, int year) {
        this.carNumber = carNumber;
        this.year = year;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car = (Car1) o;
        return year == car.year && Objects.equals(carNumber, car.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNumber, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", year=" + year +
                '}';
    }
}
