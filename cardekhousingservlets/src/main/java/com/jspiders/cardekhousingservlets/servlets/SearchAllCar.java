package com.jspiders.cardekhousingservlets.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhousingservlets.jdbc.CarJDBC;
import com.jspiders.cardekhousingservlets.object.Car;

@WebServlet("/search_cars")
public class SearchAllCar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Car> cars = CarJDBC.searchAllCars();
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("search_cars.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}










