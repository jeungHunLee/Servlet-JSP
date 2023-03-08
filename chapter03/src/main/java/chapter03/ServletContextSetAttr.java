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

@WebServlet("/scset")
public class ServletContextSetAttr extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext context = this.getServletContext();


        List person = new ArrayList();
        person.add("이순신");
        person.add("코리아시스템");

        context.setAttribute("person", person);    //person 객체에 "person"이라는 Attribute로 binding
        context.setAttribute("city", "서울");    //"서울" String 객체에 "city"라는 Attribute로 binding
    }
}
