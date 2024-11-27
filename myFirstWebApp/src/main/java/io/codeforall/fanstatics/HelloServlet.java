package io.codeforall.fanstatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    Users user = new Users("Rui Ferrão", "rui.ferrao@academiadecodigo.org", "918008555");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/rui.jsp");
        req.setAttribute("user",user);

        dispatcher.forward(req, resp);

    }
}
