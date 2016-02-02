import java.sql.ResultSet;

/**
 * Created by Juha on 28/01/16.
 */
public class Tehtava3 {

    public static void main(String[] args) {

        DBFactory factory = new DBFactory();
        String[] params = {"ank%","%iri","%kaulus%","vek%"};
        for(int i = 0; i < params.length; i++ ) {
            ResultSet rs = factory.preparedQuery("SELECT * FROM henkilo WHERE sukunimi LIKE ?", new String[] { params[i] });
            Log.printSet(rs);
            System.out.print("\n");
        }

    }

}
