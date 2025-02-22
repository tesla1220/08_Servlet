package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;

        // 필기. httpRequest 의 getMethod() method는 어떠한 http method
        //  메소드 요청이 들어온 것인지 문자열 형태로 반환을 해준다.
        String httpMethod = httpRequest.getMethod();

        System.out.println("httpMethod = " + httpMethod);
        // GET

        if(("GET").equals(httpMethod)){
            doGet(httpRequest, httpResponse);
        } else if(("POST").equals(httpMethod)){
            doPost(httpRequest, httpResponse);
        }

        /* 필기
            GET, POST
                -HEAD, OPTIONS, PUT, DELETE, TRACE, CONNECT
                - 하지만 대부분 GET과 POST를 주로 사용
         */
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청 처리할 메소드 호출함!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청 처리할 메소드 호출함!!");
    }
}
 