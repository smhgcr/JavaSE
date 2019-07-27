package com.calisma.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sqlQuery = "update city set Population=51875, District='Duzce' where id=? ";
            statement = connection.prepareStatement(sqlQuery);
            statement.setInt(1,4081);
            int result = statement.executeUpdate();

            System.out.println("Kayit guncellendi");

        } catch (SQLException exception) {

            helper.showErrorMessage(exception);

        } finally {
            statement.close();
            connection.close();

        }

    }
}
