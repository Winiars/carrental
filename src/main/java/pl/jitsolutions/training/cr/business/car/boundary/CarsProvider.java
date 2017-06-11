package pl.jitsolutions.training.cr.business.car.boundary;

import pl.jitsolutions.training.cr.business.car.entity.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JIT on 10.06.2017.
 */
public class CarsProvider {

    public List<Car> getCars(){
        Car car1=new Car();
        car1.setManufacture("VM");
        car1.setModel("Passat");
        car1.setColor("Blue");
        car1.setRegisterNumber("GD4311");
        car1.setSeatsNumber(5);
        car1.setYear(2000);
        car1.setId(1);

        Car car2=new Car();
        car2.setManufacture("VM");
        car2.setModel("Polo");
        car2.setColor("Blue");
        car2.setRegisterNumber("GD4311");
        car2.setSeatsNumber(2);
        car2.setYear(2001);
        car2.setId(2);

        Car car3=new Car();
        car3.setManufacture("Opel");
        car3.setModel("Astra");
        car3.setColor("Blue");
        car3.setRegisterNumber("GD1111");
        car3.setSeatsNumber(5);
        car3.setYear(2010);
        car3.setId(3);

        Car car4=new Car();
        car4.setManufacture("BMW");
        car4.setModel("x6");
        car4.setColor("Black");
        car4.setRegisterNumber("GD4522");
        car4.setSeatsNumber(7);
        car4.setYear(2002);
        car4.setId(4);

        Car car5=new Car();
        car5.setManufacture("BMW");
        car5.setModel("x4");
        car5.setColor("yellow");
        car5.setRegisterNumber("GD3311");
        car5.setSeatsNumber(5);
        car5.setYear(2000);
        car5.setId(5);

        return Stream.of(car1,car2,car3,car4,car5).collect(Collectors.toList());
    }



}
