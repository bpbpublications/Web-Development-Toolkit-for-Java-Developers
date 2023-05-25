package org.primefaces.showcase.service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import org.primefaces.showcase.domain.Car;

@Named(name = "carService")
@ApplicationScoped

public class CarService {
    private final static String[] colors;
    private final static String[] brands;
    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        // ...other colors...
    }

    public List createCars(int size) {
        List list = new ArrayList();
        for(int i = 0 ; i < size ; i++)
          {
            list.add(new Car(getRandomId(), getRandomBrand(),       getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
        }
        return list;
    }
    // Utility methods like getRandomId() have been removed
}
