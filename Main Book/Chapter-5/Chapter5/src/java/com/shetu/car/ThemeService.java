/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.car;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE 37
 */
@ManagedBean(name = "themeService", eager = true)
@ApplicationScoped
public class ThemeService {
    private List<Theme> themes;
}
