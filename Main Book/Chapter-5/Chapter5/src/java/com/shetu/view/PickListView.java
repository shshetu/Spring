/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class PickListView {
    @ManagedProperty("#{themeService}")
    private ThemeService service;
}
