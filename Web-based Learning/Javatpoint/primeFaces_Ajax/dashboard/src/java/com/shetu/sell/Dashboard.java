/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.sell;

/**
 *
 * @author J2EE 37
 */
public class Dashboard {
    private String dashboardTitle = "Admin Dashboard";
    private double todaySales= 15000.0;
    private double weeklyAvgSales= 70000.0;
    private double lastMonthSales= 18000000.0;
    private int totalNoofCustomers = 25000;
    private String mostPurchasedCustomer = "Mr. Arif";
    private int noOfProductsInShop = 380;

    public String getDashboardTitle() {
        return dashboardTitle;
    }

    public void setDashboardTitle(String dashboardTitle) {
        this.dashboardTitle = dashboardTitle;
    }

    public double getTodaySales() {
        return todaySales;
    }

    public void setTodaySales(double todaySales) {
        this.todaySales = todaySales;
    }

    public double getWeeklyAvgSales() {
        return weeklyAvgSales;
    }

    public void setWeeklyAvgSales(double weeklyAvgSales) {
        this.weeklyAvgSales = weeklyAvgSales;
    }

    public double getLastMonthSales() {
        return lastMonthSales;
    }

    public void setLastMonthSales(double lastMonthSales) {
        this.lastMonthSales = lastMonthSales;
    }

    public int getTotalNoofCustomers() {
        return totalNoofCustomers;
    }

    public void setTotalNoofCustomers(int totalNoofCustomers) {
        this.totalNoofCustomers = totalNoofCustomers;
    }

    public String getMostPurchasedCustomer() {
        return mostPurchasedCustomer;
    }

    public void setMostPurchasedCustomer(String mostPurchasedCustomer) {
        this.mostPurchasedCustomer = mostPurchasedCustomer;
    }

    public int getNoOfProductsInShop() {
        return noOfProductsInShop;
    }

    public void setNoOfProductsInShop(int noOfProductsInShop) {
        this.noOfProductsInShop = noOfProductsInShop;
    }
    
}
