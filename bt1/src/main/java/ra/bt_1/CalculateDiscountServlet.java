package ra.bt_1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", value = "/CalculateDiscountServlet")
public class CalculateDiscountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));

        double discountAmount = price * discount * 0.01;
        double discountPrice = price - discountAmount;

//        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Discount Calculation Result</title></head>");
        out.println("<body><h2>Discount Calculation Result</h2>");
        out.println("<p><strong>Product Description:</strong> " + description + "</p>");
        out.println("<p><strong>List Price:</strong> $" + price + "</p>");
        out.println("<p><strong>Discount Percent:</strong> " + discount + "%</p>");
        out.println("<p><strong>Discount Amount:</strong> $" + discountAmount + "</p>");
        out.println("<p><strong>Discount Price:</strong> $" + discountPrice + "</p>");
        out.println("</body></html>");
        out.close();
    }
}