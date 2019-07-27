package com.calisma.delete;

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
            String sql = "delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4083);
            int result = statement.executeUpdate();
            System.out.println("Kayit silindi");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
