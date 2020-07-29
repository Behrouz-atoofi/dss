package srv;

import dao.login_reg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username") ;
        String password = request.getParameter("password") ;
        
        if (login_reg.authenticate(username,password)) {
            request.setAttribute("login","successfully login");
            request.getRequestDispatcher("admin.jsp").forward(request,response); ;
        } else {
            request.setAttribute("login","WrongUserOrPass");
            response.sendRedirect("error.html");
        }

    }
}
