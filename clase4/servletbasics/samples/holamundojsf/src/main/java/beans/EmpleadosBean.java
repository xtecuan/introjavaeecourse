/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import service.EmpleadosService;
import service.model.Empleado;

/**
 *
 * @author xtecuan
 */
@Named(value = "empleadosBean")
@ViewScoped
public class EmpleadosBean implements Serializable {

//    private Integer id;
//    private String nombres;
//    private String apellidos;
//    private String email;
//    private Date fechanac;
    private Empleado emp;
    private List<Empleado> lista;

    @Inject
    private EmpleadosService service;

    @PostConstruct
    private void init() {
        this.emp = new Empleado();
        this.lista = service.listado();
    }

    /**
     * Creates a new instance of EmpleadosBean
     */
    public EmpleadosBean() {
    }

    public void addMessage(String summary, String detail) {

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                summary, detail));
    }

    public void guardar() {

        System.out.println(emp.getNombres() + " " + emp.getApellidos()
        );
        //service.guardarEmpleado(id, nombres, apellidos, email, fechanac);
        service.guardarEmpleado(emp);
        this.lista = service.listado();
        addMessage("Se creo un empleado", emp.getNombres() + " " + emp.getApellidos());

    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNombres() {
//        return nombres;
//    }
//
//    public void setNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getFechanac() {
//        return fechanac;
//    }
//
//    public void setFechanac(Date fechanac) {
//        this.fechanac = fechanac;
//    }
    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public List<Empleado> getLista() {
        return lista;
    }

    public void setLista(List<Empleado> lista) {
        this.lista = lista;
    }

}
