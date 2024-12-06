package io.codeforall.fanstatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/cheers.jsp");
        dispatcher.forward(req, resp);

    }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String name = req.getParameter("name");
       String email = req.getParameter("email");
       String phone = req.getParameter("phone");

       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/rui.jsp");
       req.setAttribute("name", name);
       req.setAttribute("email", email);
       req.setAttribute("phone", phone);

       dispatcher.forward(req, resp);
   }
}
