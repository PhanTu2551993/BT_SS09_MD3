package ra.bt_3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Fix cứng tên đăng nhập và mật khẩu
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra đúng sai
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // Nếu đúng, chuyển hướng đến trang "Đăng nhập thành công"
            response.sendRedirect("login-success.jsp");
        } else {
            // Nếu sai, trả về trang đăng nhập với thông báo
            request.setAttribute("message", "Tài khoản hoặc mật khẩu không chính xác!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }
}