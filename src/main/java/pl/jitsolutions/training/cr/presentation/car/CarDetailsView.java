package pl.jitsolutions.training.cr.presentation.car;

import pl.jitsolutions.training.cr.business.car.boundary.CarsProvider;
import pl.jitsolutions.training.cr.business.car.entity.Car;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by JIT on 10.06.2017.
 */

@Named
@RequestScoped
public class CarDetailsView {

    private int selectedCarId;

    @Inject
    private CarsProvider carsProvider;

    private Car car;


    public void init() {
        List<Car> cars = carsProvider.getCars();

        car = cars.stream().filter(c -> selectedCarId == c.getId()).findFirst().get();
    }

    public int getSelectedCarId() {
        return selectedCarId;
    }

    public void setSelectedCarId(int selectedCarId) {
        this.selectedCarId = selectedCarId;
    }

    public Car getCar() {
        return car;

    }


}
