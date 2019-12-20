/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.ejemplos.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author xtecuan
 */
public class SesionServlet extends HttpServlet {

    private static final String UNKNOWN = "Desconocido";
    private static final String LEER = "leersesion.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombres = req.getParameter("nombres");
        String apellidos = req.getParameter("apellidos");
        String email = req.getParameter("email");
        String bday = req.getParameter("bday");

        HttpSession session = req.getSession();

        if (nombres != null && nombres.length() > 0) {
            session.setAttribute("nombres", nombres);
        } else {
            session.setAttribute("nombres", UNKNOWN);
        }

        if (apellidos != null && apellidos.length() > 0) {
            session.setAttribute("apellidos", apellidos);
        } else {
            session.setAttribute("apellidos", UNKNOWN);
        }

        if (email != null && email.length() > 0) {
            session.setAttribute("email", email);
        } else {
            session.setAttribute("email", UNKNOWN);
        }

        if (bday != null && bday.length() > 0) {
            session.setAttribute("bday", bday);
        } else {
            session.setAttribute("bday", UNKNOWN);
        }

        resp.sendRedirect(getServletContext().getContextPath() + "/" + LEER);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
