/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import calendar.JspCalendar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xtecuan
 */
@WebServlet(name = "CalendarServlet",urlPatterns = {"/calendar.fede","/micalendario.do","/miservletcalendario.julian"})
public class CalendarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JspCalendar cal = new JspCalendar();
        String miFecha = cal.getDayOfMonth() + "/" + cal.getMonth() + "/" + cal.getYear();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + miFecha + "</h1>");
    }

}
