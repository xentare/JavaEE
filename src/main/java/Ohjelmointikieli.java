import java.sql.Date;

/**
 * Created by Juha on 02/02/16.
 */

class Ohjelmointikieli {

    private int id;
    private String nimi;
    private String versio;
    private String suunnittelija;
    private Date julkaistu;

    public Ohjelmointikieli() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public String getSuunnittelija() {
        return suunnittelija;
    }

    public void setSuunnittelija(String suunnittelija) {
        this.suunnittelija = suunnittelija;
    }

    public Date getJulkaistu() {
        return julkaistu;
    }

    public void setJulkaistu(Date julkaistu) {
        this.julkaistu = julkaistu;
    }

    @Override
    public String toString() {
        return "Ohjelmointikieli{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", versio='" + versio + '\'' +
                ", suunnittelija='" + suunnittelija + '\'' +
                ", julkaistu=" + julkaistu +
                '}';
    }
}
