package DB;

import java.sql.*;

public class Driver {
    public static void main(String[] args) throws SQLException {
         String fistname;
         int score;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_foxandhounds", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select fistname, sum(score) from people group by fistname");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("fistname"));
            System.out.println(resultSet.getInt("sum(score)"));
        }

    public static void  insertQuery () {
            Statement statement1 = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PEOPLE (FISTNAME, SCORE) VALUES (?, ?)");
            ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM PEOPLE GROUP BY FISTNAME");
            while (resultSet.next()) {
                fistname = resultSet1.getString("fistname"));
                score = resultSet1.getInt("sum(score)"));
            }
        }

    }

}