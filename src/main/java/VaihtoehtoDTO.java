/**
 * Created by Juha on 01/02/16.
 */
public class VaihtoehtoDTO {

    private int id, kysymys_id;
    private String teksti;
    private boolean oikein;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKysymys_id() {
        return kysymys_id;
    }

    public void setKysymys_id(int kysymys_id) {
        this.kysymys_id = kysymys_id;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public boolean isOikein() {
        return oikein;
    }

    public void setOikein(boolean oikein) {
        this.oikein = oikein;
    }

    public VaihtoehtoDTO() {

    }

}
