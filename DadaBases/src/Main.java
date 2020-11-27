import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "max";
        String password = "Tdutybq19911991";
        String URL = "jdbc:mysql://localhost:3306/Lessons?serverTimezone=UTC&useSSL=false";
//        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(URL, userName, password);

    }
}

