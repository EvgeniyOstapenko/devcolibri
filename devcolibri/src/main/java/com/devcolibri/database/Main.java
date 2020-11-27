package com.devcolibri.database;

import java.sql.*;

public class Main {


    private static final String URL = "jdbc:mysql://localhost:3306/Lessons?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Tdutybq19911991";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute("drop table Books");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS `lessons`.`books` (\n" +
                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(30) NOT NULL,\n" +
                    "  `img` BLOB,\n" +
                    "  PRIMARY KEY (`id`))\n" +
                    "ENGINE = InnoDB\n" +
                    "DEFAULT CHARACTER SET = utf8;");
            statement.executeUpdate("INSERT INTO Users (name, password) VALUES ('max', '123')");
            statement.executeUpdate("INSERT INTO Users (name, password) VALUES ('otherGue', '321')");


//            while (resultSet.next()) {
//                System.out.println("userName: " + resultSet.getString("name"));
//                System.out.println("userName: " + resultSet.getString("password"));
//            }
            if (!connection.isClosed()) {
                System.out.println("We are connected!!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
