/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implementar lógica para mostrar tickets
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Lista de Tickets</h1>");
        
        // Conectar a la base de datos y recuperar tickets
        // Ejemplo simple:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tickets_db", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tickets");

            while (rs.next()) {
                out.println("<p>Ticket ID: " + rs.getInt("id") + ", Description: " + rs.getString("description") + ", Status: " + rs.getString("status") + "</p>");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        }

        out.println("</body></html>");
    }
}
