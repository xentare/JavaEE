import java.sql.ResultSet;

/**
 * Created by Juha on 28/01/16.
 */
public class Log {

    public static void printSet(ResultSet rs) {
        try {
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getBigDecimal(5)+" "+rs.getDate(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
