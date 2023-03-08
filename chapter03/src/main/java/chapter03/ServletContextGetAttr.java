package chapter03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/scget")
public class ServletContextGetAttr extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        ServletContext context = this.getServletContext();

        List person = (ArrayList)context.getAttribute("person");    //"person" Attribute를 가지는 value 추출
        String user_name = (String)person.get(0);
        String user_company = (String)person.get(1);

        String user_city = (String)context.getAttribute("city");

        out.println(user_name + " : " + user_name);
        out.println(user_company + " : " + user_company);
        out.println(user_city);
    }
}
