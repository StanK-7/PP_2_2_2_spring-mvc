package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Toyota", 1998));
        carList.add(new Car(2, "Mazda", 2003));
        carList.add(new Car(3, "BMW", 2009));
        carList.add(new Car(4, "Honda", 2017));
        carList.add(new Car(5, "Citroen", 2014));
    }


    @Override
    public List<Car> getCarsbyCount(Integer count) {
        List<Car> carsToShow = new ArrayList<>();

        if (count < 5) {
            carsToShow.addAll(carList.subList(0, count));
        } else {
            carsToShow.addAll(carList);
        }
        return carsToShow;
    }
}
