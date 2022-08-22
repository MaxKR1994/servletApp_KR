package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/availableCarServlet")
public class AvailableCarServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Car> list = null;
        try {
            list = CarRepository.getAllAvailableCars();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Car car : list) {
            out.print(car);
        }
        out.close();
    }
}
