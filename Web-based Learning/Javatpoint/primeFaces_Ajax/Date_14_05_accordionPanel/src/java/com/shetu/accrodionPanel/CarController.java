/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.accrodionPanel;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class CarController {

    private List<Car> cars;

    public List<Car> getCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Bd nano", "Bangladesh will start producing"
                + " BD nano soon"));
        cars.add(new Car("Tata Nano", "Tata nano project is not successful!"));
        cars.add(new Car("Hata Nano", "Tata nano project is not successful!"));
        cars.add(new Car("Lata feno", "Tata nano project is not successful!"));
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
