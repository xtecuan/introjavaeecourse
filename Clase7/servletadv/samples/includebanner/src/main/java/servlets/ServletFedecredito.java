/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xtecuan
 */
public class ServletFedecredito extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher d = getServletContext().getRequestDispatcher("/pages/header.jsp");
        if (d != null) {
            d.include(req, resp);
        }
        d = getServletContext().getRequestDispatcher("/pages/content.jsp");
        if (d != null) {
            d.include(req, resp);
        }
        d = getServletContext().getRequestDispatcher("/pages/footer.jsp");
        if (d != null) {
            d.include(req, resp);
        }

    }

}
