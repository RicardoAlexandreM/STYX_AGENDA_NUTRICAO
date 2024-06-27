package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

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

    public LogData(Long idLogData, String tabela, int idTabela, Date date, String origin, String destiny) {
        this.idLogData = idLogData;
        this.tabela = tabela;
        this.idTabela = idTabela;
        this.date = date;
        this.origin = origin;
        this.destiny = destiny;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogData logData = (LogData) o;
        return idTabela == logData.idTabela && Objects.equals(idLogData, logData.idLogData) && Objects.equals(tabela, logData.tabela) && Objects.equals(date, logData.date) && Objects.equals(origin, logData.origin) && Objects.equals(destiny, logData.destiny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLogData, tabela, idTabela, date, origin, destiny);
    }
}
