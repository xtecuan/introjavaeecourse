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

/**
 *
 * @author xtecuan
 */
public class MiFiltro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest r = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        System.out.println("La pagina que se acceso fue: " + r.getRequestURI());
        Map<String, String[]> params = request.getParameterMap();
        Set<String> names = params.keySet();

        for (String name : names) {

            System.out.print(name + "=");

            String[] values = params.get(name);

            for (String value : values) {
                System.out.println(value);
            }
        }

        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }

}
