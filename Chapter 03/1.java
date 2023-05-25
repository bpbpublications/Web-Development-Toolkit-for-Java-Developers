package propertyfile;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class PropertyFile
{
   public static void main(String[] args) 
{
        Properties props = new Properties();
FileInputStreamfis = null;
        Connection con = null;
        try 
{
fis = new FileInputStream("D:\\PropertyFile\\src\\propertyfile\\db.properties");
props.load(fis);

Class.forName(props.getProperty("driver"));

            con = DriverManager.getConnection(props.getProperty("url"), 
props.getProperty("uname"), 
props.getProperty("pwd"));

             Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
ResultSet.CONCUR_UPDATABLE);

            String select_query = "SELECT * FROM CONTACT_INFO";

System.out.printf("Query :  " + select_query + "\n\n");

ResultSetrs = stmt.executeQuery(select_query);

System.out.printf("\033[34;1mFirst Name\033[0m \t\t\033[34;1mLast Name\033[0m\t\t 
\033[34;1mPhone\t\t\t   \033[34;1mEmail Address \t\t \n");

          while (rs.next()) 
{
System.out.printf("%s\t\t        %s\t\t         %s\t\t   %s\t\t \n ", rs.getString(2), rs.getString(4), 
rs.getString(9), rs.getString(10));
           }

System.out.printf("\n\n\n");
        }
 catch (Exception e)
 {
System.err.println("Exception occured \n" + e);
        }
    }

}