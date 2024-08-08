<%-- 
    Document   : tickets
    Created on : 7 ago. 2024, 09:06:09
    Author     : USER
--%>

<%@ page import="java.sql.*" %>
<html>
<body>
    <h1>Lista de Tickets</h1>
    <%
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
            e.printStackTrace();
        }
    %>
</body>
</html>

