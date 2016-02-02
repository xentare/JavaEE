import java.sql.ResultSet;

/**
 * Created by Juha on 28/01/16.
 */
public class Tehtava4 {

    public static void main(String[] args) {

        DBFactory db = new DBFactory();
        String[] query = {"INSERT INTO henkilo (etunimi,sukunimi,sotu,palkka,syntymaaika) VALUES" +
                "('Musta'," + "'Pekka', '010626', 1200.00, '1926-06-01')","INSERT INTO henkilo (etunimi,sukunimi,sotu,palkka,syntymaaika) VALUES" +
                "('Musta', 'Kaapu', '300539', 12900.90,'1939-05-30')"};
/*        db.preparedQuery(preparedQuery[0]);
        db.preparedQuery(preparedQuery[1]);*/

        String select = "SELECT * FROM henkilo WHERE etunimi = ?";
        ResultSet rs = db.preparedQuery(select,new String[] {"Musta"});
        Log.printSet(rs);

    }

}
