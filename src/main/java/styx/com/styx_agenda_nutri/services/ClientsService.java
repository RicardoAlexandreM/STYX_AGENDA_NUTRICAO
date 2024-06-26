package styx.com.styx_agenda_nutri.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.entities.Clients;
import styx.com.styx_agenda_nutri.repositories.ClientsRepository;

import java.util.Optional;

@Service
public class ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    public Clients findByIdClients(Long id) {
        Optional<Clients> client = this.clientsRepository.findById(id);
        return client.orElseThrow(() -> new RuntimeException("Error: Cliente: " + id + " não localizado"));
    }

    @Transactional
    public Clients insertClients(Clients obj){
        obj.setIdClients(null);
        obj = this.clientsRepository.save(obj);

        return obj;
    }

    @Transactional
    public Clients updateClients(Clients obj){
        Clients objAux = findByIdClients(obj.getIdClients());
        objAux.setNome(obj.getNome());
        objAux.setCpf(obj.getCpf());
        objAux.setSituation(obj.getSituation());

        return this.clientsRepository.save(objAux);
    }

}
