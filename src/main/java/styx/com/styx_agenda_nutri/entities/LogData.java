package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LogData")
public class LogData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLogData", unique = true, nullable = false)
    private Long idLogData;

    @Column(name = "tabela", nullable = false, length = 50)
    private String tabela;

    @Column(name = "idTabela", nullable = false)
    private int idTabela;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "origin", nullable = false, length = 255)
    private String origin;

    @Column(name = "destiny", nullable = false, length = 255)
    private String destiny;

    public LogData() {

    }

    public Long getIdLogData() {
        return idLogData;
    }

    public void setIdLogData(Long idLogData) {
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
