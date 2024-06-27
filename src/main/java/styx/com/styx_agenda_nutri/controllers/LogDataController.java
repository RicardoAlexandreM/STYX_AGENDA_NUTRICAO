package styx.com.styx_agenda_nutri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.models.LogData;
import styx.com.styx_agenda_nutri.services.LogDataService;

@RestController
@RequestMapping("/logdata")
public class LogDataController {

    @Autowired
    private LogDataService logDataService;

    @GetMapping("/{id}")
    public ResponseEntity<LogData> findBYIdLogData(@PathVariable Long id){

        LogData obj = this.logDataService.findByIdLogData(id);
        return ResponseEntity.ok().body(obj);
    }

}
