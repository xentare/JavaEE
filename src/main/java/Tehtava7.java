import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juha on 01/02/16.
 */
public class Tehtava7 {

    public static void main(String[] args) {
        DBFactory db = new DBFactory();
        DBMethods dbMethods = new DBMethods();
        List<MonivalintaDTO> questions = DBMethods.getQuestions(db);

        for(MonivalintaDTO question : questions) {
            System.out.println(question.toString());
        }
    }

    static class DBMethods {

        public static List<MonivalintaDTO> getQuestions (DBFactory db) {
            List<MonivalintaDTO> questions = new ArrayList<MonivalintaDTO>();
            try {
                PreparedStatement statement = db.getConnection().prepareStatement("SELECT * FROM monivalinta");
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    MonivalintaDTO monivalintaDTO = new MonivalintaDTO();
                    monivalintaDTO.setId(rs.getInt(1));
                    monivalintaDTO.setKysymys(rs.getString(2));

                    monivalintaDTO.setVaihtoehtoDTOs(getOptions(db, monivalintaDTO.getId()));

                    questions.add(monivalintaDTO);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return questions;
        }

        public static List<VaihtoehtoDTO> getOptions (DBFactory db, int questionId){
            List<VaihtoehtoDTO> options = new ArrayList<VaihtoehtoDTO>();
            try {
                PreparedStatement statement = db.getConnection().prepareStatement("SELECT * FROM vaihtoehto WHERE kys_id = ?");
                statement.setInt(1, questionId);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    VaihtoehtoDTO option = new VaihtoehtoDTO();
                    option.setId(rs.getInt(1));
                    option.setKysymys_id(rs.getInt(2));
                    option.setTeksti(rs.getString(3));
                    option.setOikein(rs.getBoolean(4));
                    options.add(option);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return options;
        }

    }

}
