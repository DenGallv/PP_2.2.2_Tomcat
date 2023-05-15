package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private static int CAR_COUNT;
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_COUNT, "A", "Black"));
        carList.add(new Car(++CAR_COUNT, "B", "White"));
        carList.add(new Car(++CAR_COUNT, "C", "Red"));
        carList.add(new Car(++CAR_COUNT, "D", "Blue"));
        carList.add(new Car(++CAR_COUNT, "E", "Grey"));
    }

    @Override
    public List<Car> getSomeCars(Integer count) {
        return count >= 5? carList : carList.subList(0, count);
    }
}
