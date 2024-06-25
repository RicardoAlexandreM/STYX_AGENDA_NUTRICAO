package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LogData")
public class LogData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLogData")
    private int idLogData;

    @Column(name = "tabela")
    private String tabela;

    @Column(name = "idTabela")
    private int idTabela;

    @Column(name = "date")
    private Date date;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destiny")
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
