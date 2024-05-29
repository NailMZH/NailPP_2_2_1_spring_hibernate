package hiber.model;

import javax.persistence.OneToOne;

public class Car {
    @OneToOne
    public User user;
    String model;
    int series;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
