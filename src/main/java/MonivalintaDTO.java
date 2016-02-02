import java.util.List;

/**
 * Created by Juha on 01/02/16.
 */
public class MonivalintaDTO {

    private int id;
    private String kysymys;
    private List<VaihtoehtoDTO> vaihtoehtoDTOs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public List<VaihtoehtoDTO> getVaihtoehtoDTOs() {
        return vaihtoehtoDTOs;
    }

    public void setVaihtoehtoDTOs(List<VaihtoehtoDTO> vaihtoehtoDTOs) {
        this.vaihtoehtoDTOs = vaihtoehtoDTOs;
    }

    public MonivalintaDTO() {

    }

}
