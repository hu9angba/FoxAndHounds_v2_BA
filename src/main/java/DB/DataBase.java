/*package DB;

import java.sql.*;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;

public class DataBase {
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test/Players", "sa", "pass");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    String SelectAll = "select * from players";
    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ResultSet resultSet;

    {
        try {
            resultSet = statement.executeQuery(SelectAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
            while (resultSet.next())
    {
        String usrname = null;
        try {
            usrname = resultSet.getString("Usrname");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int score = 0;
        try {
            score = resultSet.getInt("Score");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(usrname +"-" + score);

    }
    Scanner scanner = new Scanner (System.in);
    String usrname = scanner.next();
    int score =scanner.nextInt();

    String insert = "Insert into Players (Usrname, score) values (?,?)" ;
    PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, usrname);
            preparedStatement.setInt(2, score);

    int i=  preparedStatement.executeUpdate();
            System.out.println(i);

}
*/


