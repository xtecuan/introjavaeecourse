/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Employees;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class MyService {

    @PersistenceContext(unitName = "samplePU")
    private EntityManager em;

    public List<Employees> findAll() {
        return em.createNamedQuery("Employees.findAll").getResultList();
    }

}
