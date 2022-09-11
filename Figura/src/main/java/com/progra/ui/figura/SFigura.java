package com.progra.ui.figura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SFigura", value = "/SFigura")
public class SFigura extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String base, altura, result;
        base = request.getParameter("base");
        altura = request.getParameter("altura");
        result = request.getParameter("result");

        request.setAttribute("base", base);
        request.setAttribute("altura", altura);
        request.setAttribute("result", result);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
