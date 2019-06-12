/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.downloadView;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class FileDownloadView {

    private StreamedContent file;

    public FileDownloadView() {
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/images/boromir.jpg");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_boromir.jpg");
    }

    public StreamedContent getFile() {
        return file;
    }

}
