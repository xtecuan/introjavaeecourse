/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.ejemplos.jsfbasics.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import sv.com.fedecredito.ejemplos.jsfbasics.entities.Departments;
import sv.com.fedecredito.ejemplos.jsfbasics.services.DepartmentService;

/**
 *
 * @author xtecuan
 */
@Named("departmentsBean")
@ViewScoped
public class DepartmentsBean implements Serializable{

    @Inject
    private DepartmentService service;

    private List<Departments> depts;

    /**
     * Creates a new instance of DepartmentsBean
     */
    public DepartmentsBean() {
    }

    @PostConstruct
    private void init() {
        this.depts = service.findAll();
    }

    public List<Departments> getDepts() {
        return depts;
    }

    public void setDepts(List<Departments> depts) {
        this.depts = depts;
    }
    
    

}
