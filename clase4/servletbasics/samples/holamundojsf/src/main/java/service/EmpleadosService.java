/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;
import service.model.Empleado;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class EmpleadosService {

    public static final String INSERT = "INSERT INTO EMPLEADOS (ID, NOMBRES, APELLIDOS, EMAIL, FECHANAC) VALUES (?,?,?,?,?)";

    @Resource(lookup = "jdbc/fedecredito")
    private DataSource ds;

    public List<Empleado> listado() {
        List<Empleado> lista = new ArrayList<>();

        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement psta = conn.prepareStatement("SELECT * FROM EMPLEADOS");
            ResultSet rset = psta.executeQuery();
            while (rset.next()) {
                Empleado e = new Empleado();
                e.setId(rset.getInt(1));
                e.setNombres(rset.getString(2));
                e.setApellidos(rset.getString(3));
                e.setEmail(rset.getString(4));
                e.setFechanac(new java.util.Date(rset.getDate(5).getTime()));
                lista.add(e);
            }

            rset.close();
            psta.close();
            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void guardarEmpleado(Empleado emp) {
        guardarEmpleado(emp.getId(), emp.getNombres(),
                emp.getApellidos(), emp.getEmail(), emp.getFechanac());
    }

    public void guardarEmpleado(
            Integer id, String nombres, String apellidos, String correo,
            Date fechanac
    ) {
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement psta = conn.prepareStatement(INSERT);
            psta.setInt(1, id);
            psta.setString(2, nombres);
            psta.setString(3, apellidos);
            psta.setString(4, correo);
            psta.setDate(5, new java.sql.Date(fechanac.getTime()));

            int r = psta.executeUpdate();
            System.out.println("Se inserto " + r + " empleado");
            psta.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
