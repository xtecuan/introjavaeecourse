/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class SampleService {

    private static final String SELECT_ALL = "SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,EMAIL FROM EMPLOYEES";
    @Resource(lookup = "jdbc/orclLocal")
    private DataSource ds;

    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<>();
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement psta = conn.prepareStatement(SELECT_ALL);
            ResultSet rset = psta.executeQuery();
            while (rset.next()) {
                Long id = rset.getLong(1);
                String fname = rset.getString(2);
                String lname = rset.getString(3);
                String email = rset.getString(4);
                list.add(new Employee(id, fname, lname, email));
            }
            rset.close();
            psta.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    
}
