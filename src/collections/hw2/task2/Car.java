package collections.hw2.task2;

public abstract class Car {
    private String marka;
    private String model;
    private int year;
    private boolean automatic;
    private int maxSpeed;

    public Car(String marka, String model, int year, boolean automatic, int maxSpeed) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.automatic = automatic;
        this.maxSpeed = maxSpeed;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", automatic=" + automatic +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
