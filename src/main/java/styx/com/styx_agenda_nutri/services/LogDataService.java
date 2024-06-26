package styx.com.styx_agenda_nutri.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.entities.LogData;
import styx.com.styx_agenda_nutri.repositories.LogDataRepository;

import java.util.Optional;

@Service
public class LogDataService {

    @Autowired
    private LogDataRepository logDataRepository;

    public LogData findByIdLogData(Long id) {
        Optional<LogData> LogsData = this.logDataRepository.findById(id);
        return LogsData.orElseThrow(() -> new RuntimeException("Error: Log: " + id + " não localizado !"));
    }

    @Transactional
    public LogData insertLogData(LogData obj){
        obj.setIdLogData(null);
        obj = this.logDataRepository.save(obj);

        return obj;
    }

    @Transactional
    public LogData updateLogData(LogData obj){
        LogData objAux = findByIdLogData(obj.getIdLogData());
        objAux.setDate(obj.getDate());
        objAux.setTabela(obj.getTabela());
        objAux.setIdTabela(obj.getIdTabela());
        objAux.setOrigin(obj.getOrigin());
        objAux.setDestiny(obj.getDestiny());

        return this.logDataRepository.save(objAux);
    }
}
