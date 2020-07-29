package srv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class registerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name") ;
        String family = req.getParameter("family") ;
        String phonenumber = req.getParameter("phoneNumebr") ;
        String username = req.getParameter("username") ;
        String password = req.getParameter("password") ;



    }
}
