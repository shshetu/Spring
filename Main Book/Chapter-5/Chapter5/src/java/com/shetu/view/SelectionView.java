/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.view;

import com.shetu.car.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author J2EE 37
 */
@ManagedBean(name = "dtSelectionView")
@ViewScoped
public class SelectionView {
    private List<Car> cars1;
    private List<Car> cars2;
    private List<Car> cars3;
    private List<Car> cars4;
    private List<Car> cars5;
    private List<Car> cars6;
    private Car selectedCar;
    private List<Car> selectedCars;
}
