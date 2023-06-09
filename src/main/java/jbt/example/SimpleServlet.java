package jbt.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -4751096228274971485L;

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hello World 222!");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet 4 " + this.getServletName() + " has started");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet 4 " + this.getServletName() + " has stopped");
	}
	
}
