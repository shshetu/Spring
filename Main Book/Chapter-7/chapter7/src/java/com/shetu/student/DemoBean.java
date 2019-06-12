/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.student;

import java.io.IOException;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

/**
 *
 * @author J2EE 37
 */
@SessionScoped
public class DemoBean {

    private Part file1;
    private Part file2;

    public Part getFile1() {
        return file1;
    }

    public void setFile1(Part file1) {
        this.file1 = file1;
    }

    public Part getFile2() {
        return file2;
    }

    public void setFile2(Part file2) {
        this.file2 = file2;
    }

    public String upload() throws IOException {
        file1.write("D:\\Round-39\\Idb-Round_39\\git\\Shetu's git\\PrimeFaces\\Main Book\\Chapter-7\\chapter7\\web\\resources\\image" +getFilename(file1));
        file2.write("D:\\Round-39\\Idb-Round_39\\git\\Shetu's git\\PrimeFaces\\Main Book\\Chapter-7\\chapter7\\web\\resources\\image"+getFilename(file2));
        return "success";
    }

    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
            return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf("\\") + 1);

            }
        }
        return null;
    }
}
