
import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = System.getenv().getOrDefault("DB_USER", "root");
        String password = System.getenv("DB_PASSWORD");

        String insertSQL = "INSERT INTO student (id, name, branch) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE name = VALUES(name), branch = VALUES(branch)";

        String selectSQL = "SELECT * FROM student";

        if (password == null || password.isBlank()) {
        System.out.println("Please set the DB_PASSWORD environment variable.");
        return;
}

        try (
            Connection con = DriverManager.getConnection(
                    url, username, password);

            PreparedStatement ps = con.prepareStatement(insertSQL)
        ) {
            // Insert a student record
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "CSE");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Inserted");
            }

            // Retrieve and display student records
            try (
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(selectSQL)
            ) {
                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("branch")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

