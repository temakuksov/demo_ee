package ru.maxima.hw_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "setCookiesServlet", value = "/set-cookies")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cFName = new Cookie("first-name", "Jack");
        Cookie cSName = new Cookie("second-name", "Smith");
        Cookie cAge = new Cookie("age", "36");
        cFName.setMaxAge(24*60*60);
        cSName.setMaxAge(24*60*60);
        cAge.setMaxAge(24*60*60);

        response.addCookie(cFName);
        response.addCookie(cSName);
        response.addCookie(cAge);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
