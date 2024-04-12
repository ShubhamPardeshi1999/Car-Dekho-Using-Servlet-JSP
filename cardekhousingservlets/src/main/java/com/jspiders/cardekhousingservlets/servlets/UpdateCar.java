package com.jspiders.cardekhousingservlets.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhousingservlets.jdbc.CarJDBC;

@WebServlet("/update_car")
public class UpdateCar extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		int id = Integer.parseInt(req.getParameter("id"));
		double price = Double.parseDouble(req.getParameter("price"));
		int res = CarJDBC.updateCar(id, price);
		if(res == 1) {
			req.setAttribute("message", "record updated");
		}else {
			req.setAttribute("message", "record not found");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("update_car.jsp");
		requestDispatcher.forward(req, resp);
	
	}
}

















