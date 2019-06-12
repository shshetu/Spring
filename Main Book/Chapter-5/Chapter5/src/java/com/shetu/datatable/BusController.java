/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.datatable;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class BusController {
    private List<Bus> busList;
    private List<Bus> selectedBusList;
    private Bus selectedBus;
    public List<Bus> getBusList() {
        busList = new ArrayList<>();
        busList.add(new Bus("100",1980,"Toyota","Red"));
        busList.add(new Bus("101",1982,"sdfsd","Redsfd"));
        busList.add(new Bus("102",1983,"sdf","Resdfdsdd"));
        busList.add(new Bus("103",1984,"Todsfota","Redsfd"));
        busList.add(new Bus("104",1985,"Toysdfota","Redsdfds"));
        busList.add(new Bus("105",1986,"Toysdfaota","Resdfd"));
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

    public List<Bus> getSelectedBusList() {
        return selectedBusList;
    }

    public void setSelectedBusList(List<Bus> selectedBusList) {
        this.selectedBusList = selectedBusList;
    }

    public Bus getSelectedBus() {
        return selectedBus;
    }

    public void setSelectedBus(Bus selectedBus) {
        this.selectedBus = selectedBus;
    }
    
}
