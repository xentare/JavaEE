import com.sun.org.apache.bcel.internal.generic.Type;
import com.sun.org.apache.xml.internal.security.keys.content.KeyValue;
import com.sun.rowset.CachedRowSetImpl;
import javafx.util.Pair;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;

/**
 * Created by Juha on 28/01/16.
 */
public class DBFactory {

    Connection connection;

    public DBFactory() {
        String url = "jdbc:mysql://localhost:3306/mydb";
        Properties props = new Properties();
        props.setProperty("user","root");
        props.setProperty("password","");
        props.setProperty("useSSL","false");
        try {
            connection = DriverManager.getConnection(url, props);
            connection.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet preparedQuery(String query, Map<String,Type> params) {
        CachedRowSetImpl rowSet = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            if(!params.equals("")) {

                for(Map.Entry<String,Type> entry : params.entrySet()) {

                }

            }
            ResultSet rs = statement.executeQuery();
            rowSet = new CachedRowSetImpl();
            rowSet.populate(rs);
        } catch (Exception e) {
            System.out.println("DBerror:"+e);
        }
        return rowSet;
    }

    public void makeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void preparedQuery(String transaction) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(transaction);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
