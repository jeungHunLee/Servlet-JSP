package chapter03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/Second" })
public class MySecondServlet extends HttpServlet {
    public static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");    //브라우저에 전달할 문서의 형태와 인코딩할 문자 집합
        PrintWriter out = response.getWriter();    //PrintWriter 객체 생성

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Second</title>");
        out.println("<body>");
        out.println("<h2>두번째 서블릿입니다.");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
