package org.primefaces.showcase.view.data;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;  
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.faces.bean.ViewScoped;
import org.primefaces.showcase.domain.Car;
import org.primefaces.showcase.service.CarService;

@Named
@ViewScoped
public class DataListView implements Serializable {
    private List<Car> cars1; 
    private Car selectedCar;
    @Inject("#{carService}")
    private CarService service;

    @PostConstruct
    public void init() {
        cars1 = service.createCars(10);
    }
    public List getCars1() {
        return cars1;
    }
    public void setService(CarService service) {
        this.service = service;
    }
}
