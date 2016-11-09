package pl.vavatech.tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vavatech on 09.11.16.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //logika
        req.setAttribute("imie", req.getParameter("name"));
        req.getRequestDispatcher("/WEB-INF/hello2.jsp").forward(req, resp);
        System.out.println("test123");
    }
}
