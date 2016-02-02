import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juha on 02/02/16.
 */
public class OhjelmointiDAO {

    final static private String query = "SELECT * FROM ohjkieli ";

    private Connection connection;
    private Statement statement;
    private String additionalQuery;

    public OhjelmointiDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Ohjelmointikieli> getOhjelmointikielet() throws SQLException {
        List<Ohjelmointikieli> list = new ArrayList<Ohjelmointikieli>();
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()) {
            Ohjelmointikieli obj = new Ohjelmointikieli();
            obj.setId(rs.getInt(1));
            obj.setNimi(rs.getString(2));
            obj.setVersio(rs.getString(3));
            obj.setSuunnittelija(rs.getString(4));
            obj.setJulkaistu(rs.getDate(5));
            list.add(obj);
        }
        return list;
    }

    public Ohjelmointikieli getOhjelmointikieli(int kieliId) throws SQLException {
        additionalQuery = "WHERE id = " + kieliId;
        Ohjelmointikieli obj = new Ohjelmointikieli();
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query+additionalQuery);
        obj.setId(rs.getInt(1));
        obj.setNimi(rs.getString(2));
        obj.setVersio(rs.getString(3));
        obj.setSuunnittelija(rs.getString(4));
        obj.setJulkaistu(rs.getDate(5));
        return obj;
    }

}
