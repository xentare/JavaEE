import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;

/**
 * Created by Juha on 28/01/16.
 */
public class HenkiloDTO {

    private String etunimi, sukunimi, sotu;
    private BigDecimal palkka;
    private Date syntymäaika;

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }

    public BigDecimal getPalkka() {
        return palkka;
    }

    public void setPalkka(BigDecimal palkka) {
        this.palkka = palkka;
    }

    public Date getSyntymäaika() {
        return syntymäaika;
    }

    public void setSyntymäaika(Date syntymäaika) {
        this.syntymäaika = syntymäaika;
    }

    public HenkiloDTO(ResultSet rs) {
        try {
            this.etunimi = rs.getString(1);
            this.sukunimi = rs.getString(2);
            this.sotu = rs.getString(3);
            this.palkka = rs.getBigDecimal(4);
            this.syntymäaika = rs.getDate(5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return this.etunimi + " " + this.sukunimi + " " + this.sotu + " " + this.palkka + " " + this.syntymäaika;
    }


}
