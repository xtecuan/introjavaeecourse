/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtros;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author xtecuan
 */
public class FiltroSeguridad implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest r = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String url = r.getRequestURI();

        System.out.println("Current URL: " + url);

        HttpSession session = r.getSession();

        String token = (String) session.getAttribute("token");

        if (token != null) {
            chain.doFilter(request, response);
        } else {
            resp.sendRedirect(r.getContextPath() + "/login.jsp");
        }

    }

    @Override
    public void destroy() {

    }

}
