package chapter04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reqNet")
public class RequestNetwork extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("프로토콜 : " + request.getScheme() + "<br>");    //요청에 사용된 프로토콜 이름
        out.print("프로토콜과 버전 : " + request.getProtocol() + "<br>");    //요청에 사용된 프로토콜 이름과 버전
        out.print("클라이언트IP : " + request.getRemoteAddr() + "<br>");    //요청한 클라이언트의 IP 주소
        out.print("서버의 IP : " + request.getLocalAddr() + "<br>");    //요청을 받은 서버의 IP 주소
        out.print("서버의 이름 : " +  request.getServerName() + "<br>");    //요청을 받은 서버의 이름
        out.print("서버의 port : " + request.getServerPort() + "<br>");    //요청을 받은 서버의 포트 번호
        out.print("요청 방식 : " + request.getMethod());    //요청 방식
    }
}