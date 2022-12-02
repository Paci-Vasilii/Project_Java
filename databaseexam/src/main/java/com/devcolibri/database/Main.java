package com.devcolibri.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root1";
    private static final String PASSWORD = "root1";

    private static final String INSERT_NEW = "INSERT INTO dish VALUES(?,?,?,?,?,?,?)";
    private static final String GET_ALL = "SELECT * FROM dish";
    private static final String DELETE = "DELETE FROM dish WHERE id = ?";

    public static void main(String[] args) {

        Connection connection ;

        PreparedStatement preparedStatement;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            preparedStatement = connection.prepareStatement(DELETE);

            preparedStatement.setInt(1, 2);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(GET_ALL);

            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                int id = res.getInt("id");
                String title = res.getString("title");
                String desc = res.getString("description");
                float rating = res.getFloat("rating");
                boolean published = res.getBoolean("published");
                Date date = res.getDate("created");
                byte[] icon = res.getBytes("icon");

                System.out.println("id: " + id + ", title: " + title + ", desc: " + desc + ", rating: " + rating +
                        ", published: " + published + ", date: " + date + ", icon length: " + icon.length);
            }

            /*
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Inserted title");
            preparedStatement.setString(3, "Inserted desc");
            preparedStatement.setFloat(4,0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("photo.jpg"));

            preparedStatement.execute();

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
*/
            connection.close();

            if (connection.isClosed()) {
                System.out.println("Соединение с БД закрыто");
            }

        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
        }
    }
}
