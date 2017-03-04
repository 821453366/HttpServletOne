package Http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 2017/3/3.
 */
@WebServlet(name = "Servlet",urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           // response.getWriter().println("123456");
        response.getOutputStream().write("大家好，我是中文".getBytes("utf-8"));
            System.out.print("打印");
    }
}
