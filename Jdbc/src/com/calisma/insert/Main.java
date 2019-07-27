package com.calisma.insert;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name, CountryCode, District, Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"HanimKoy");
            statement.setString(2,"TUR");
            statement.setString(3,"HanimKoy");
            statement.setInt(4,65783);
            int result = statement.executeUpdate();

            System.out.println("Kayit olusturuldu.");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
