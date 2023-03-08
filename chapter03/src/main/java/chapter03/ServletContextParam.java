package chapter03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/param")
public class ServletContextParam extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //모든 Servlet이 함께 공유하는 Servlet Context
        ServletContext context = this.getServletContext();

        Enumeration<String> paramNames = context.getInitParameterNames();    //parameter name를 Enum 타입으로 반환
        while(paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = context.getInitParameter(name);    //name에 해당하는 value 반환
            out.print(name + ": " + value + "<br>");
        }

        /* JAVA 문법
        hasMoreElements() method
        Java에서 Enumeration은 순서를 가진 배열
        Enumeration은 커서를 가지고 맨 처음 0번 위치부터 시작
        hasMoreElements() method는 Enumeration에 읽을 수 있는 요소가 남아 있는지에 대한 true, false를 return

        nextElement() method
        nextElement() method는 Enumeration의 커서를 다음 요소로 이동
         */
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
