package ra.bt_2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserDataServlet", value = "/UserDataServlet")
public class UserDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String showUserData = request.getParameter("showUserData");
        if ("true".equals(showUserData)) {
            UserData userData = new UserData();
            userData.setId(1);
            userData.setName("John Doe");
            userData.setEmail("john@example.com");
            userData.setAge(30);

            request.setAttribute("userData", userData);

            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}