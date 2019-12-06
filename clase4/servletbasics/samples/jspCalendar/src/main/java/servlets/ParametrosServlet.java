/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import calendar.JspCalendar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xtecuan
 */
public class ParametrosServlet extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            String dia = this.getInitParameter("dia");
//            String mes = this.getInitParameter("mes");
//            String annio = this.getInitParameter("annio");
//
//            JspCalendar cal = new JspCalendar(
//                    Integer.parseInt(dia),
//                    Integer.parseInt(mes),
//                    Integer.parseInt(annio));
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Fecha con parametros de inicializacion</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>" + cal.getDayOfMonth() + "/" + cal.getMonth() + "/" + cal.getYear() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            PreparedStatement psta = conn.prepareStatement("select * from empleados");

            ResultSet rset = psta.executeQuery();

            out.println("<ul>");
            while (rset.next()) {
                out.println("<li>" + rset.getString("nombres") + " " + rset.getString("apellidos") + "</li>");
            }
            out.println("</ul>");

            rset.close();
            psta.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Connection conn;

    @Override
    public void init() throws ServletException {
        try {
            DriverManager.registerDriver(new org.h2.Driver());
            conn = DriverManager.getConnection("jdbc:h2:~/fedecredito", "sa", "sa");
            System.out.println("Conectado a fedecredito H2");
        } catch (Exception e) {
            System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }

    @Override
    public void destroy() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }

}
