package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LogData")
public class LogData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLogData;
    private String tabela;
    private int idTabela;
    private Date date;
    private String origin;
    private String destiny;

    public LogData() {

    }

    public LogData(int idLogData) {

    }

    public int getIdLogData() {
        return idLogData;
    }

    public void setIdLogData(int idLogData) {
        this.idLogData = idLogData;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public int getIdTabela() {
        return idTabela;
    }

    public void setIdTabela(int idTabela) {
        this.idTabela = idTabela;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
}
