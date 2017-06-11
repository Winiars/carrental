package pl.jitsolutions.training.cr.presentation.car;


import pl.jitsolutions.training.cr.business.car.boundary.CarsProvider;
import pl.jitsolutions.training.cr.business.car.entity.Car;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JIT on 10.06.2017.
 */

@Named
@RequestScoped
public class CarsView {

    @Inject
    private CarsProvider carsProvider;

    public List<Car>  getCars(){
        return carsProvider.getCars();
    }

}
