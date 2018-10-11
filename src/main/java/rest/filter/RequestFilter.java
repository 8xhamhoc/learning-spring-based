package rest.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class RequestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            System.out.println("URL: " + httpServletRequest.getRequestURI());
            System.out.println("Query String: " + httpServletRequest.getQueryString());
            chain.doFilter(request, response);
        } catch (Exception e) {
            request.setAttribute("errorMessage", e);
            // For Spring MVC return a web page
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
    }

    @Override
    public void destroy() {

    }

}
