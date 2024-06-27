package styx.com.styx_agenda_nutri.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.models.ClientsMetrics;
import styx.com.styx_agenda_nutri.repositories.ClientsMetricsRepository;

import java.util.Optional;

@Service
public class ClientsMetricsService {

    @Autowired
    private ClientsMetricsRepository clientsMetricsRepository;

    public ClientsMetrics findByIdClientsMetrics(Long id) {
        Optional<ClientsMetrics> clientsMetric = this.clientsMetricsRepository.findById(id);
        return clientsMetric.orElseThrow(() -> new RuntimeException("Error: Metrica: " + id + " não localizada"));
    }

    @Transactional
    public ClientsMetrics insertClientsMetrics(ClientsMetrics obj){

        obj.setIdClientsMetrics(null);
        obj = this.clientsMetricsRepository.save(obj);

        return obj;
    }

    public ClientsMetrics updateClientsMetrics(ClientsMetrics obj){

        ClientsMetrics objAux = findByIdClientsMetrics(obj.getIdClientsMetrics());
        obj.setClients(obj.getClients());
        objAux.setAge(obj.getAge());
        objAux.setWeight(obj.getWeight());
        objAux.setWeightUnit(obj.getWeightUnit());
        objAux.setHeight(obj.getHeight());
        objAux.setHeightUnit(obj.getHeightUnit());
        objAux.setProtein(obj.getProtein());
        objAux.setCarbohydrate(obj.getCarbohydrate());
        objAux.setFat(obj.getFat());

        return this.clientsMetricsRepository.save(objAux);
    }
}
