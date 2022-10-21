package com.example.zero.service;

import com.example.zero.model.Client;
import com.example.zero.repository.ClientRepository;
import com.example.zero.request.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client registration(RegistrationRequest registrationRequest){
        Client client = registrationRequest.saveRquestObject();
        System.out.println(client.getCpf());

        return clientRepository.save(client);
    }

}
