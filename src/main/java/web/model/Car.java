package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private String model;
       private int yearOfProduction;

    public Car() {
    }

    public Car(int id, String model, int yearOfProduction) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
