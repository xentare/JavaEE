import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juha on 01/02/16.
 */
public class Tehtava7 {

    public static void main(String[] args) {
        DBFactory db = new DBFactory();

        ResultSet rs = db.preparedQuery("SELECT * FROM monivalinta",new String[] {});
        try {
            while (rs.next()) {
                List<VaihtoehtoDTO> list = new ArrayList<VaihtoehtoDTO>();
                MonivalintaDTO monivalintaDTO = new MonivalintaDTO();
                monivalintaDTO.setId(rs.getInt(1));
                monivalintaDTO.setKysymys(rs.getString(2));
                ResultSet answers = db.preparedQuery("SELECT * FROM vaihtoehto WHERE kys_id ='?'", new String[] {"1"});
                while(answers.next()) {
                    VaihtoehtoDTO vaihtoehtoDTO = new VaihtoehtoDTO();
                    vaihtoehtoDTO.setId(answers.getInt(1));
                    vaihtoehtoDTO.setKysymys_id(answers.getInt(2));
                    vaihtoehtoDTO.setTeksti(answers.getString(3));
                    vaihtoehtoDTO.setOikein(answers.getBoolean(4));
                    list.add(vaihtoehtoDTO);
                }
                monivalintaDTO.setVaihtoehtoDTOs(list);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
