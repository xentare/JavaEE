import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juha on 28/01/16.
 */
public class Tehtava5 {

    public static void main(String[] args) {

        DBFactory db = new DBFactory();

        List<HenkiloDTO> list = new ArrayList<HenkiloDTO>();

        String query = "SELECT etunimi,sukunimi,sotu,palkka,syntymaaika FROM henkilo WHERE sukunimi = ? OR sukunimi = ?";
        String[] params = {"Ankka","Hiiri"};

        ResultSet rs = db.preparedQuery(query,params);
        try {
            while (rs.next()) {
                HenkiloDTO henkilo = new HenkiloDTO(rs);
                list.add(henkilo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        for(HenkiloDTO henkilo : list) {
            System.out.println(henkilo);
        }

    }
}
