package ra.bt_4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BMIServlet", value = "/BMIServlet")
public class BMIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Lấy dữ liệu từ form
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        // Tính chỉ số BMI
        double bmi = weight / (height * height);

        // Hiển thị kết quả
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>BMI Result</title></head>");
        out.println("<body><h1>BMI Result</h1>");
        out.println("<p><strong>Height:</strong> " + height + " m</p>");
        out.println("<p><strong>Weight:</strong> " + weight + " kg</p>");
        out.println("<p><strong>BMI:</strong> " + bmi + "</p>");

        // Phân loại BMI
        if (bmi < 18.5) {
            out.println("<p><strong>Result:</strong> Underweight</p>");
        } else if (bmi >= 18.5 && bmi < 25) {
            out.println("<p><strong>Result:</strong> Normal weight</p>");
        } else if (bmi >= 25 && bmi < 30) {
            out.println("<p><strong>Result:</strong> Overweight</p>");
        } else {
            out.println("<p><strong>Result:</strong> Obesity</p>");
        }

        out.println("</body></html>");

    }
}