/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.accrodionPanel;

/**
 *
 * @author J2EE 37
 */

public class Car {

    private String carName;
    private String carDetails;

    public Car() {
    }

    public Car(String carName, String carDetails) {
        this.carName = carName;
        this.carDetails = carDetails;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

}
