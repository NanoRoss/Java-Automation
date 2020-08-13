package Tests.Learning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlConect {


    public void ConectBD()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://database.server.develop.agrofy.com;database=Agrofy.AccountsDB.Integration;integratedSecurity=true;user=;password=;");

            //System.out.println("Database Name: " + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT Name FROM ComputerStatus");

            while(resultSet.next())
            {
                System.out.println("Computer Name: " + resultSet.getString("Name"));
            }

            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("Problem Connecting!");
        }
    }

}
