/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import servicio.dto.Region;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class ServicioJDBC {

    private static final Logger logger = LogManager.getLogger(ServicioJDBC.class);
    private static final String QUERY_REGIONS = "SELECT * FROM REGIONS";

    @Resource(lookup = "jdbc/orcl")
    private DataSource ds;

    public List<Region> findRegions() {
        List<Region> regions = new ArrayList<Region>();
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement psta = conn.prepareStatement(QUERY_REGIONS);
            ResultSet rset = psta.executeQuery();
            while (rset.next()) {
                Long id = rset.getLong("REGION_ID");
                String name = rset.getString("REGION_NAME");
                Region r = new Region(id, name);
                regions.add(r);
            }
            rset.close();
            psta.close();
            conn.close();

        } catch (Exception e) {
            logger.error("Error en el metodo: findRegions", e);
        }

        return regions;
    }

    
    
    
}
