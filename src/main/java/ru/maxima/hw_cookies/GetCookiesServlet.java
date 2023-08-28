package ru.maxima.hw_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookiesServlet", value = "/get-cookies")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Cookies List</title>");
        pw.println("</head><body><br>");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                pw.println("<p>" + cookie.getName() + " - " + cookie.getValue() + " (max age = " + cookie.getMaxAge() + " days)</p><hr>");
            }
        } else {
            pw.println("<br><h2> You haven't cookies, click to <a href=\"set-cookies\">set cookies</a></h2>");
        }
        pw.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
