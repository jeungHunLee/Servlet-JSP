package chapter04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/gParam1")
public class GetParameter1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");    //POST 방식에서 전달하는 값이 한글인 경우 인코딩
        response.setContentType("text/html;charset=utf-8");    //브라우저에 출력할 글자 형식 지정
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        String name = request.getParameter("name");
        float score = Float.parseFloat(request.getParameter("score"));

        out.print("번호: " + num + "<br>");
        out.print("이름: " + name + "<br>");
        out.print("성적: " + score + "<br>");
    }
}