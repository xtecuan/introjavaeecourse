/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entities.Employees;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.MyService;

/**
 *
 * @author xtecuan
 */
public class ConsumerServlet extends HttpServlet{

    @Inject
    private MyService service;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            
            List<Employees> list = service.findAll();
            
            req.setAttribute("employees", list);
            
            RequestDispatcher d = getServletContext().getRequestDispatcher("/index.jsp");
            
            d.forward(req, resp);
            
            
        } catch (Exception e) {
        }
    }
    
}
