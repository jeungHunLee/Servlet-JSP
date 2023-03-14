package chapter04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reqURL")
public class RequestURL extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("요청 URI : " + request.getRequestURI() + "<br>");
        out.println("요청 URL : " + request.getRequestURL() + "<br>");
        out.print("쿼리스트링 : " + request.getQueryString() + "<br>");
        out.print("컨텍스트 경로 : " + request.getContextPath() + "<br>");
        out.print("서블릿 경로 : " + request.getServletPath());
    }
}