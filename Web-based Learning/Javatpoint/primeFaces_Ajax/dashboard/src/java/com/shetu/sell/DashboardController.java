/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.sell;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class DashboardController {
   public Dashboard dashboard;

    public Dashboard getDashboard() {
       if(dashboard == null){
       dashboard =  new Dashboard();
       dashboard.setDashboardTitle("ATM Mobile Shop");
       }
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
   
}
