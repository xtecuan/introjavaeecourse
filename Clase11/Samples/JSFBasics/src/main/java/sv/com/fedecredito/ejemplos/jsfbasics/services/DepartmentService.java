/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.ejemplos.jsfbasics.services;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.com.fedecredito.ejemplos.jsfbasics.entities.Departments;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class DepartmentService {

    @PersistenceContext(unitName = "orclPU")
    private EntityManager em;

    //findAll
    public List<Departments> findAll() {
        List<Departments> depts = new ArrayList<>();

        depts = em.createNamedQuery("Departments.findAll").getResultList();

        return depts;
    }

    public Departments findById(Short departmentId) {
        return em.find(Departments.class, departmentId);
    }

}
